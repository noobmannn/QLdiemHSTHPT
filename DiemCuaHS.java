package com.actvn.qldiemhsthpt;

public class DiemCuaHS {

    private String MaHS;
    private double diemTBmon;
    private String hocLuc;

    public DiemCuaHS() {
    }

    public DiemCuaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public double getDiemTBmon() {
        return diemTBmon;
    }

    public void setDiemTBmon(double diemTBmon) {
        this.diemTBmon = diemTBmon;
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }

}
