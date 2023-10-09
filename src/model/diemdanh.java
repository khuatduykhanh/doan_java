/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cuong
 */
public class diemdanh {
    private int id;
    private String idHV;
    private String hoTen;
    private String goiTap;
    private String ngayTap;

    public diemdanh(int id, String idHV, String hoTen, String goiTap, String ngayTap) {
        this.id = id;
        this.idHV = idHV;
        this.hoTen = hoTen;
        this.goiTap = goiTap;
        this.ngayTap = ngayTap;
    }
    
   

    public diemdanh(String idHV, String hoTen, String goiTap, String ngayTap) {
        this.idHV = idHV;
        this.hoTen = hoTen;
        this.goiTap = goiTap;
        this.ngayTap = ngayTap;
    }

    

    public diemdanh() {
    }

    public String getIdHV() {
        return idHV;
    }

    public void setIdHV(String idHV) {
        this.idHV = idHV;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGoiTap() {
        return goiTap;
    }

    public void setGoiTap(String goiTap) {
        this.goiTap = goiTap;
    }

    public String getNgayTap() {
        return ngayTap;
    }

    public void setNgayTap(String ngayTap) {
        this.ngayTap = ngayTap;
    }
    
    
}
