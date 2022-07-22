/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore05.doan;

import java.util.Scanner;

/**
 *
 * @author anhtu
 */
public class ThongTinHocSinh {

    static Scanner sc = new Scanner(System.in);
    String hoVaTen;
    String lop;
    String sinhNhat;
    String queQuan;

    public ThongTinHocSinh(String hoVaTen, String lop, String sinhNhat, String queQuan) {
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.sinhNhat = sinhNhat;
        this.queQuan = queQuan;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(String sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setHoten() {
        System.out.println("Nhap ho va ten: ");
         
    }

}
