/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author cuong
 */
public class JDBCConnection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/do_an_oop";
        final String user = "root";
        final String password = "";
        try{
            Connection con = DriverManager.getConnection(url,user,password);
            return con;
        }
        catch(SQLException e){
        return null;
        } 
    }
}
