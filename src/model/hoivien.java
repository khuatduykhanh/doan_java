    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cuong
 */
public class hoivien {
    private int id;
    private String hoten;
    private String sdt;
    private String email;
    private String goitap;
    private String status;

    public hoivien() {
    }

    public hoivien(int id, String hoten, String sdt, String email, String goitap, String status) {
        this.id = id;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.goitap = goitap;
        this.status = status;
    }

    public hoivien(String hoten, String sdt, String email, String goitap, String status) {
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.goitap = goitap;
        this.status = status;
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

    public String getGoitap() {
        return goitap;
    }

    public void setGoitap(String goitap) {
        this.goitap = goitap;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
