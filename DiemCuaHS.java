package com.actvn.qldiemhsthpt;

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

    public List<DiemTungMon> getTatCaMon() {
        return TatCaMon;
    }

    public void setTatCaMon(List<DiemTungMon> TatCaMon) {
        this.TatCaMon = TatCaMon;
    }

    public void nhapDiem(double[] d) {
        for (int i = 0; i < 10; i++) {
            DiemTungMon tmp = new DiemTungMon(d[i]);
            TatCaMon.add(tmp);
        }
    }

    public void suaDiem(int index, double d) {
        DiemTungMon tmp = new DiemTungMon(d);
        switch (index) {
            case 0 ->
                TatCaMon.set(index, tmp);
            case 1 ->
                TatCaMon.set(index, tmp);
            case 2 ->
                TatCaMon.set(index, tmp);
            case 3 ->
                TatCaMon.set(index, tmp);
            case 4 ->
                TatCaMon.set(index, tmp);
            case 5 ->
                TatCaMon.set(index, tmp);
            case 6 ->
                TatCaMon.set(index, tmp);
            case 7 ->
                TatCaMon.set(index, tmp);
            case 8 ->
                TatCaMon.set(index, tmp);
            case 9 ->
                TatCaMon.set(index, tmp);
        }
    }

    public void xoaDiemMotMon(int index) {
        DiemTungMon tmp = null;
        TatCaMon.set(index, tmp);
    }

    public void DiemTb() {
        double sum = 0.0;
        for (DiemTungMon items : TatCaMon) {
            sum += items.getDiem_cac_mon();
        }
        setDiemTBmon(sum / 10);
        if (getDiemTBmon() >= 8.0) {
            setHocLuc("Gioi");
        } else if (getDiemTBmon() >= 6.5 && getDiemTBmon() < 8.0) {
            setHocLuc("Kha");
        } else if (getDiemTBmon() >= 5.0 && getDiemTBmon() < 6.5) {
            setHocLuc("Trung Binh");
        } else if (getDiemTBmon() >= 3.5 && getDiemTBmon() < 5.0) {
            setHocLuc("Yeu");
        } else if (getDiemTBmon() >= 0 && getDiemTBmon() < 3.5) {
            setHocLuc("Kem");
        }
    }

    public void xuatThongTin() {
        System.out.println("");
        System.out.println("Ma hoc sinh: " + MaHS);
        System.out.println("Diem cac mon cua hoc sinh: ");
        System.out.println("- Toan: " + TatCaMon.get(0).getDiem_cac_mon());
        System.out.println("- Vat Ly: " + TatCaMon.get(1).getDiem_cac_mon());
        System.out.println("- Hoa Hoc: " + TatCaMon.get(2).getDiem_cac_mon());
        System.out.println("- Sinh Hoc: " + TatCaMon.get(3).getDiem_cac_mon());
        System.out.println("- Tin Hoc: " + TatCaMon.get(4).getDiem_cac_mon());
        System.out.println("- Cong Nghe: " + TatCaMon.get(5).getDiem_cac_mon());
        System.out.println("- Ngu Van: " + TatCaMon.get(6).getDiem_cac_mon());
        System.out.println("- Dia Ly: " + TatCaMon.get(7).getDiem_cac_mon());
        System.out.println("- Lich Su: " + TatCaMon.get(8).getDiem_cac_mon());
        System.out.println("- Giao Duc Cong Dan: " + TatCaMon.get(9).getDiem_cac_mon());
        System.out.println("Diem Trung Binh Mon Cua Hoc Sinh: " + getDiemTBmon());
        System.out.println("Hoc Luc cua Hoc Sinh: " + getHocLuc());
        System.out.println("------------------------------------");
    }

}
