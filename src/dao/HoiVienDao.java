/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author cuong
 */
public class HoiVienDao {

    public static String getIDHV() {
        int id = 1;
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "select max(id) from hoi_vien";
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

    public void saveHoiVien(hoivien hv) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "INSERT INTO hoi_vien (hoTen,sdt,email,goiTap,status) values(?,?,?,?,'true')";

            PreparedStatement statementGT = con.prepareStatement(sql);
            statementGT.setString(1, hv.getHoten());
            statementGT.setString(2, hv.getSdt());
            statementGT.setString(3, hv.getEmail());
            statementGT.setString(4, hv.getGoitap());
            statementGT.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public hoivien checkIn(String id) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            int i = Integer.parseInt(id);
            String sql = "Select * from hoi_vien where id= '" + i + "'";
            PreparedStatement statementHD = con.prepareStatement(sql);
            ResultSet rs = statementHD.executeQuery(sql);
            while (rs.next()) {
                hoivien hv = new hoivien();
                hv.setHoten(rs.getString("hoTen"));
                hv.setSdt(rs.getString("sdt"));
                hv.setEmail(rs.getString("email"));
                hv.setGoitap(rs.getString("goiTap"));
                hv.setStatus(rs.getString("status"));
                return hv;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static hoivien getHoiHV(String id) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            int i = Integer.parseInt(id);
            String sql = "Select * from hoi_vien where id= '" + i + "'";
            PreparedStatement statementHD = con.prepareStatement(sql);
            ResultSet rs = statementHD.executeQuery(sql);
            while (rs.next()) {
                hoivien hv = new hoivien();
                hv.setHoten(rs.getString("hoTen"));
                hv.setSdt(rs.getString("sdt"));
                hv.setEmail(rs.getString("email"));
                hv.setGoitap(rs.getString("goiTap"));
                hv.setStatus(rs.getString("status"));
                return hv;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<hoivien> getAllHV() {
        ArrayList<hoivien> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoi_vien";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoivien hv = new hoivien();
                hv.setId(rs.getInt("id"));
                hv.setHoten(rs.getString("hoTen"));
                hv.setSdt(rs.getString("sdt"));
                hv.setEmail(rs.getString("email"));
                hv.setStatus(rs.getString("status"));
                ar.add(hv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }
    
    public static ArrayList<hoivien> getHoiVienByEmail(String email) {
        ArrayList<hoivien> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoi_vien where email like '%" + email + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoivien hv = new hoivien();
                hv.setId(rs.getInt("id"));
                hv.setHoten(rs.getString("hoTen"));
                hv.setSdt(rs.getString("sdt"));
                hv.setEmail(rs.getString("email"));
                hv.setStatus(rs.getString("status"));
                ar.add(hv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }
    public static ArrayList<hoivien> getHoiVienByID(String ID) {
        ArrayList<hoivien> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoi_vien where id = '"+ID+"'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoivien hv = new hoivien();
                hv.setId(rs.getInt("id"));
                hv.setHoten(rs.getString("hoTen"));
                hv.setSdt(rs.getString("sdt"));
                hv.setEmail(rs.getString("email"));
                hv.setStatus(rs.getString("status"));
                ar.add(hv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    
}
