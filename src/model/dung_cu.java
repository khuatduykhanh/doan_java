/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cuong
 */
public class dung_cu {
    private int id;
    private String tenThietBi;
    private String hangSX;
    private String soLuong;

    public dung_cu(int id, String tenThietBi, String hangSX, String soLuong) {
        this.id = id;
        this.tenThietBi = tenThietBi;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
    }

    public dung_cu() {
    }

    public dung_cu(String tenThietBi, String hangSX, String soLuong) {
        this.tenThietBi = tenThietBi;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
    
}
