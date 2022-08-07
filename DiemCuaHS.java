package com.actvn.qldiemhsthpt;

import java.util.ArrayList;

public class DiemCuaHS {

    private String MaHS;
    private double diemTBmon;
    private String hocLuc;
    
    private ArrayList<DiemTungMon> TatCaMon = new ArrayList<>(10);

    public ArrayList<DiemTungMon> getTatCaMon() {
        return TatCaMon;
    }

    public void setTatCaMon(ArrayList<DiemTungMon> TatCaMon) {
        this.TatCaMon = TatCaMon;
    }

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
    
    public void nhapDiem(double[] d) {
        for (int i = 0; i < d.length; i++) {
            DiemTungMon tmp = new DiemTungMon(d[i]);
            TatCaMon.add(tmp);
        }
    }

    public void suaDiem(int index, double d) {
        DiemTungMon tmp = new DiemTungMon(d);
        TatCaMon.set(index, tmp);
    }

    public void xoaDiemMotMon(int index) {
        DiemTungMon tmp = null;
        TatCaMon.set(index, tmp);
    }

    public void DiemTb() {
        double sum = 0;
        for(DiemTungMon items : TatCaMon){
            sum += items.getDiem_cac_mon();
        }
        diemTBmon = sum / 10;
        if (diemTBmon >= 8.0) {
            hocLuc = "Gioi";
        } else if (diemTBmon >= 6.5 && diemTBmon < 8.0) {
            hocLuc = "Kha";
        } else if (diemTBmon >= 5.0 && diemTBmon < 6.5) {
            hocLuc = "Trung Binh";
        } else if (diemTBmon >= 3.5 && diemTBmon < 5.0){
            hocLuc = "Yeu";
        } else if (diemTBmon >= 0 && diemTBmon < 3.5) {
            hocLuc = "Kem";
        }
    }
    
    public void xuatThongTin(){
        System.out.println("Ma hoc sinh: " + MaHS);
        System.out.println("Diem cac mon cua hoc sinh: ");
        System.out.println("- Toan: " + TatCaMon.get(0));
        System.out.println("- Vat Ly: " + TatCaMon.get(1));
        System.out.println("- Hoa Hoc: " + TatCaMon.get(2));
        System.out.println("- Sinh Hoc: " + TatCaMon.get(3));
        System.out.println("- Tin Hoc: " + TatCaMon.get(4));
        System.out.println("- Cong Nghe: " + TatCaMon.get(5));
        System.out.println("- Ngu Van: " + TatCaMon.get(6));
        System.out.println("- Dia Ly: " + TatCaMon.get(7));
        System.out.println("- Lich Su: " + TatCaMon.get(8));
        System.out.println("- Giao Duc Cong Dan: " + TatCaMon.get(9));
        System.out.println("Diem Trung Binh Mon Cua Hoc Sinh: " + getDiemTBmon());
        System.out.println("Hoc Luc cua Hoc Sinh: " + getHocLuc());
    }

}
