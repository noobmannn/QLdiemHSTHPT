package com.actvn.qldiemhsthpt.model;

import java.util.ArrayList;
import java.util.List;

public class DiemCuaHS {

    private String MaHS;
    private double diemTBmon;
    private String hocLuc;

    private List<DiemTungMon> TatCaMon = new ArrayList<>(10);

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
        diemTBmon = 0.0;
        for (DiemTungMon items : TatCaMon) {
            diemTBmon += items.getDiem_cac_mon();
        }
        diemTBmon = diemTBmon / 10;
        return diemTBmon;
    }

    public void setDiemTBmon(double diemTBmon) {
        this.diemTBmon = diemTBmon;
    }

    public String getHocLuc() {
        if (getDiemTBmon() >= 8.0) {
            hocLuc = "Giỏi";
        } else if (getDiemTBmon() >= 6.5 && getDiemTBmon() < 8.0) {
            hocLuc = "Khá";
        } else if (getDiemTBmon() >= 5.0 && getDiemTBmon() < 6.5) {
            hocLuc = "Trung Bình";
        } else if (getDiemTBmon() >= 3.5 && getDiemTBmon() < 5.0) {
            hocLuc = "Yếu";
        } else if (getDiemTBmon() >= 0 && getDiemTBmon() < 3.5) {
            hocLuc = "Kém";
        }
        return hocLuc;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc;
    }

    public List<DiemTungMon> getTatCaMon() {
        return TatCaMon;
    }

    public void setTatCaMon(List<DiemTungMon> TatCaMon) {
        this.TatCaMon = TatCaMon;
    }

    public boolean checkdiem(){
        int c = 0;
        for(DiemTungMon item : TatCaMon){
            if(item.getDiem_cac_mon() >= 0 && item.getDiem_cac_mon() <= 10){
                c++;
            }
        }
        return c == 10;
    }
}
