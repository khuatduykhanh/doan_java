/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cuong
 */
public class hoa_don {
    private int id;
    private String hoten;
    private String sdt;
    private String email;
    private String giatien;
    private String goitap;
    private String ngaydangky;

    public hoa_don(int id, String hoten, String sdt, String email, String giatien, String goitap, String ngaydangky) {
        this.id = id;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.giatien = giatien;
        this.goitap = goitap;
        this.ngaydangky = ngaydangky;
    }

    public hoa_don(String hoten, String sdt, String email, String giatien, String goitap, String ngaydangky) {
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.giatien = giatien;
        this.goitap = goitap;
        this.ngaydangky = ngaydangky;
    }
    
    public hoa_don() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getGoitap() {
        return goitap;
    }

    public void setGoitap(String goitap) {
        this.goitap = goitap;
    }

    public String getNgaydangky() {
        return ngaydangky;
    }

    public void setNgaydangky(String ngaydangky) {
        this.ngaydangky = ngaydangky;
    }
    
    
}
