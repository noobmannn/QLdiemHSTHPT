package com.actvn.qldiemhsthpt.model;

public class HocSinh {

    private String MaHS;
    private String hoVaTenDem;
    private String ten;
    private String lop;
    private int GioiTinh;
    private String sinhNhat;    
    private String queQuan;

    public HocSinh() {
    }

    public HocSinh(String MaHS, String hoVaTenDem, String ten, String lop, int GioiTinh, String sinhNhat, String queQuan) {
        this.MaHS = MaHS;
        this.hoVaTenDem = hoVaTenDem;
        this.ten = ten;
        this.lop = lop;
        this.GioiTinh = GioiTinh;
        this.sinhNhat = sinhNhat;
        this.queQuan = queQuan;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
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
}
