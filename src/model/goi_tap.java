/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cuong
 */
public class goi_tap {
    private int id;
    private String tenGoiTap;
    private String giaTien;

    public goi_tap(int id, String tenGoiTap, String giaTien) {
        this.id = id;
        this.tenGoiTap = tenGoiTap;
        this.giaTien = giaTien;
    }

    public goi_tap() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenGoiTap() {
        return tenGoiTap;
    }

    public void setTenGoiTap(String tenGoiTap) {
        this.tenGoiTap = tenGoiTap;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }
    
}
