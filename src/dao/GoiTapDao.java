/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import model.goi_tap;

/**
 *
 * @author cuong
 */
public class GoiTapDao {
    public static String getID() {
        int id = 1;
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "select max(id) from goi_tap";
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
    public void saveGoiTap(goi_tap goitap) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "INSERT INTO goi_tap (tenGoiTap,giaTien) values(?,?)";

            PreparedStatement statementGT = con.prepareStatement(sql);
            statementGT.setString(1, goitap.getTenGoiTap());
            statementGT.setString(2, goitap.getGiaTien());
            statementGT.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<goi_tap> getAllRecords() {
        ArrayList<goi_tap> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from goi_tap";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                goi_tap gt = new goi_tap(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                ar.add(gt);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static goi_tap getGoiTapByName(String name) {
        goi_tap gt = new goi_tap();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from goi_tap where tenGoiTap like '%" + name + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                gt.setTenGoiTap(rs.getString(2));
                gt.setGiaTien(rs.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return gt;
    }

    public static void delete(String id) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "delete from goi_tap where id= '" + id + "' ";
            PreparedStatement statementGT = con.prepareStatement(sql);
            statementGT.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void update (goi_tap dc){
        try ( Connection con = JDBCConnection.getJDBCConnection()){
            String sql = "update goi_tap set tenGoiTap = '"+dc.getTenGoiTap()+"',"
                    + "giaTien = '"+dc.getGiaTien()+"'"
                    + "where id ='"+dc.getId()+"'";
            PreparedStatement statementGT = con.prepareStatement(sql);
            statementGT.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
