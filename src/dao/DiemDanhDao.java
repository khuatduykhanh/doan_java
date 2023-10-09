/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.diemdanh;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author cuong
 */
public class DiemDanhDao {

    public void saveDiemDanh(diemdanh dd) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "INSERT INTO diem_danh (ho_ten,goi_tap,ngay_tap,idHoiVien) values(?,?,?,?)";

            PreparedStatement statementDD = con.prepareStatement(sql);
            statementDD.setString(1, dd.getHoTen());
            statementDD.setString(2, dd.getGoiTap());
            statementDD.setString(3, dd.getNgayTap());
            statementDD.setString(4, dd.getIdHV());
            statementDD.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<diemdanh> getAllRecords() {
        ArrayList<diemdanh> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from diem_danh";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                diemdanh dd = new diemdanh(rs.getInt(1),
                        rs.getString(5),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));

                ar.add(dd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static ArrayList<diemdanh> getDDbyID(String ID) {
        ArrayList<diemdanh> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from diem_danh where idHoiVien = '" + ID + "'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                diemdanh dd = new diemdanh();
                dd.setNgayTap(rs.getString("ngay_tap"));
                ar.add(dd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static ArrayList<diemdanh> getDDbyMonth(String year, String month) {
        ArrayList<diemdanh> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from diem_danh where Month(ngay_tap) = '" + month + "' "
                    + "and Year(ngay_tap) = '" + year + "'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                diemdanh dd = new diemdanh();
                dd.setHoTen(rs.getString("ho_ten"));
                dd.setIdHV(rs.getString("idHoiVien"));
                dd.setGoiTap(rs.getString("goi_tap"));
                dd.setNgayTap(rs.getString("ngay_tap"));
                ar.add(dd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static ArrayList<diemdanh> getDDbyYear(String year) {
        ArrayList<diemdanh> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from diem_danh where Year(ngay_tap) = '" + year + "' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                diemdanh dd = new diemdanh();
                dd.setHoTen(rs.getString("ho_ten"));
                dd.setIdHV(rs.getString("idHoiVien"));
                dd.setGoiTap(rs.getString("goi_tap"));
                dd.setNgayTap(rs.getString("ngay_tap"));
                ar.add(dd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }
    
    public static ArrayList<diemdanh> getDDbyDay(String date) {
        ArrayList<diemdanh> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from diem_danh where Date(ngay_tap) = '" + date + "' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                diemdanh dd = new diemdanh();
                dd.setHoTen(rs.getString("ho_ten"));
                dd.setIdHV(rs.getString("idHoiVien"));
                dd.setGoiTap(rs.getString("goi_tap"));
                dd.setNgayTap(rs.getString("ngay_tap"));
                ar.add(dd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }
    
    public static ArrayList<diemdanh> getDDbyBetweenDay(String date1,String date2) {
        ArrayList<diemdanh> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from diem_danh where Date(ngay_tap) >= '" + date1 + "' "
                    + "and Date(ngay_tap) < '" + date2 + "'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                diemdanh dd = new diemdanh();
                dd.setHoTen(rs.getString("ho_ten"));
                dd.setIdHV(rs.getString("idHoiVien"));
                dd.setGoiTap(rs.getString("goi_tap"));
                dd.setNgayTap(rs.getString("ngay_tap"));
                ar.add(dd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }
    
}
