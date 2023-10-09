/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.dung_cu;
import model.goi_tap;
/**
 *
 * @author cuong
 */
public class DungCuDao {
    public static String getID() {
        int id = 1;
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "select max(id) from dung_cu";
            PreparedStatement statementHD = con.prepareStatement(sql);
            ResultSet rs = statementHD.executeQuery(sql);
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return String.valueOf(id);
    }
    
    public void saveDungCu(dung_cu dc){
        try ( Connection con = JDBCConnection.getJDBCConnection()){
            String sql = "INSERT into dung_cu (ten_thiet_bi,hang_sx,so_luong) values (?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, dc.getTenThietBi());
            statement.setString(2, dc.getHangSX());
            statement.setString(3, dc.getSoLuong());
             statement.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList<dung_cu> getAllRecords() {
        ArrayList<dung_cu> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from dung_cu";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                dung_cu gt = new dung_cu(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                ar.add(gt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }
    
    public static void delete(String id) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "delete from dung_cu where id= '" + id + "' ";
            PreparedStatement statementGT = con.prepareStatement(sql);
            statementGT.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void update (dung_cu dc){
        try ( Connection con = JDBCConnection.getJDBCConnection()){
            String sql = "update dung_cu set ten_thiet_bi = '"+dc.getTenThietBi()+"',"
                    + "hang_sx = '"+dc.getHangSX()+"',"
                    + "so_luong = '"+dc.getSoLuong()+"' "
                    + "where id ='"+dc.getId()+"'";
            PreparedStatement statementGT = con.prepareStatement(sql);
            statementGT.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
