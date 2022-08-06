package com.actvn.qldiemhsthpt;

import java.util.Scanner;

public class HocSinh {

    Scanner sc = new Scanner(System.in);

    private String MaHS;
    private String hoVaTenDem;
    private String ten;
    private String lop;
    private String sinhNhat;
    private String queQuan;

    public HocSinh() {
    }

    public HocSinh(String MaHS, String hoVaTenDem, String ten, String lop, String sinhNhat, String queQuan) {
        this.MaHS = MaHS;
        this.hoVaTenDem = hoVaTenDem;
        this.ten = ten;
        this.lop = lop;
        this.sinhNhat = sinhNhat;
        this.queQuan = queQuan;
    }

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public String getHoVaTenDem() {
        return hoVaTenDem;
    }

    public void setHoVaTenDem(String hoVaTenDem) {
        this.hoVaTenDem = hoVaTenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
        //nhap ma hoc sinh
        System.out.println("Ma hoc sinh: ");
        setMaHS(sc.nextLine());
        //nhap ho va ten dem
        System.out.println("Ho va Ten Dem: ");
        setHoVaTenDem(sc.nextLine());
        //nhap ten
        System.out.println("Ten hoc sinh: ");
        setTen(sc.nextLine());
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
        System.out.println("Ma hoc sinh: " + MaHS);
        System.out.println("Ho va ten: " + UpperFirstChar(hoVaTenDem) + " " + UpperFirstChar(ten));
        System.out.println("Lop: " + lop);
        System.out.println("Ngay sinh: " + sinhNhat);
        System.out.println("Que quan: " + UpperFirstChar(queQuan));
    }

    public void suaThongTin(int thongTin, String noiDung) {
        switch (thongTin) {
            case 1 ->
                setHoVaTenDem(noiDung);
            case 2 ->
                setTen(noiDung);
            case 3 ->
                setLop(noiDung);
            case 4 ->
                setSinhNhat(noiDung);
            case 5 ->
                setQueQuan(noiDung);
        }
    }
}
