/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.qldiemhsthpt;

import java.util.Scanner;

/**
 *
 * @author anhtu
 */
public class HocSinh {

    Scanner sc = new Scanner(System.in);

    private String hoVaTen;
    private String lop;
    private String sinhNhat;
    private String queQuan;
    private String maSoHocSinh;

    public HocSinh() {
    }

    public HocSinh(String hoVaTen, String lop, String sinhNhat, String queQuan, String maSoHocSinh) {
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.sinhNhat = sinhNhat;
        this.queQuan = queQuan;
        this.maSoHocSinh = maSoHocSinh;
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

    public String getMaSoHocSinh() {
        return maSoHocSinh;
    }

    public void setMaSoHocSinh(String maSoHocSinh) {
        this.maSoHocSinh = maSoHocSinh;
    }

    private String UpperFirstChar(String name) {
        //để chuyển đổi name thành một mảng kiểu char
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for (int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if (Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if (foundSpace) {
                    //đổi chữ cái thành chữ in hoa
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        // chuyển đổi mảng char thành string
        name = String.valueOf(charArray);

        return name;
    }

    public void nhapThongTin() {
        //nhap ho ten
        System.out.println("Ho va ten: ");
        String name = sc.nextLine();
        setHoVaTen(name);
        //nhap lop
        System.out.println("Lop: ");
        setLop(sc.nextLine());
        //ngay sinh
        System.out.println("Ngay sinh: ");
        setSinhNhat(sc.nextLine());
        //nhap que quan
        System.out.println("Que quan: ");
        setQueQuan(sc.nextLine());

    }

    public void xuatThongTin() {
        System.out.println("Ho va ten: " + UpperFirstChar(hoVaTen));
        System.out.println("Lop: " + lop);
        System.out.println("Ngay sinh: " + sinhNhat);
        System.out.println("Que quan: " + UpperFirstChar(queQuan));
    }

}
