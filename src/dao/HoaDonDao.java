/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import model.diemdanh;
import model.hoa_don;

/**
 *
 * @author cuong
 */
public class HoaDonDao {

    public static String getIDHD() {
        int id = 1;
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "select max(id) from hoa_don";
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

    public void saveHoaDon(hoa_don HD) {
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "insert into hoa_don (hoten, sdt, email, giatien, goitap, ngaydangky) values (?,?,?,?,?,?)";

            PreparedStatement statementHD = con.prepareStatement(sql);
            statementHD.setString(1, HD.getHoten());
            statementHD.setString(2, HD.getSdt());
            statementHD.setString(3, HD.getEmail());
            statementHD.setString(4, HD.getGiatien());
            statementHD.setString(5, HD.getGoitap());
            statementHD.setString(6, HD.getNgaydangky());
            statementHD.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<hoa_don> getAllRecords() {
        ArrayList<hoa_don> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoa_don";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoa_don hd = new hoa_don(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));

                ar.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static ArrayList<hoa_don> getHDbyMonth(String year, String month) {
        ArrayList<hoa_don> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoa_don where Month(ngaydangky) = '" + month + "' "
                    + "and Year(ngaydangky) = '" + year + "'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoa_don hd = new hoa_don(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));

                ar.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static ArrayList<hoa_don> getHDbyYear(String year) {
        ArrayList<hoa_don> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoa_don where Year(ngaydangky) = '" + year + "' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoa_don hd = new hoa_don(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));

                ar.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static ArrayList<hoa_don> getHDbyDay(String date) {
        ArrayList<hoa_don> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoa_don where Date(ngaydangky) = '" + date + "' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoa_don hd = new hoa_don(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));

                ar.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }

    public static ArrayList<hoa_don> getHDbyBetweenDay(String date1, String date2) {
        ArrayList<hoa_don> ar = new ArrayList<>();
        try ( Connection con = JDBCConnection.getJDBCConnection()) {
            String sql = "Select * from hoa_don where Date(ngaydangky) >= '" + date1 + "' "
                    + "and Date(ngaydangky) < '" + date2 + "'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                hoa_don hd = new hoa_don(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));

                ar.add(hd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ar;
    }
}
