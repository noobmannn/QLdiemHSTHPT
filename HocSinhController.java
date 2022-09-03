package com.actvn.qldiemhsthpt;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class HocSinhController {

    private static final String CURRENT_DIR = System.getProperty("user.dir");
    private static final String SEPARATOR = File.separator;
    private static final String JSON_WRITER_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "HocSinh.json";

    static Scanner sc = new Scanner(System.in);

    public static void show(List<HocSinh> list) {
        System.out.println("----------------------");
        System.out.println("Danh Sach Hoc Sinh: ");
        for (HocSinh items : list) {
            System.out.println("Thong Tin Hoc Sinh: ");
            items.xuatThongTin();
        }
        System.out.println("----------------------");
    }

    public static void nhapDanhSachHocSinh(List<HocSinh> list, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Nhap Thong Tin Hoc Sinh Thu " + (i + 1) + ": ");
            HocSinh hs = new HocSinh();
            hs.nhapThongTin();
            list.add(hs);
        }

        show(list);
    }

    public static void themMotHocSinhvaoDanhSach(List<HocSinh> list) {
        System.out.println("Nhap Thong Tin Hoc Sinh Can Them Vao: ");
        HocSinh hsThem = new HocSinh();
        hsThem.nhapThongTin();
        list.add(hsThem);

        show(list);
    }

    public static void suaThongTinHocSinh(List<HocSinh> list) {
        System.out.println("Nhap ma Hoc Sinh cua Sinh Vien Can Sua: ");
        String maHSsua = sc.nextLine();
        /*
        tt = :
        1. Sua Ho Va Ten cua hoc sinh
        2. Sua Lop
        3. Sua Ngay Sinh
        4. Sua Que Quan
         */
        for (HocSinh items : list) {
            if (items.getMaHS().equals(maHSsua)) {
                System.out.println("Chon Thong Tin Can Sua: ");
                int tt = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap Noi Dung Can Sua: ");
                String noiDung = sc.nextLine();
                items.suaThongTin(tt, noiDung);
                break;
            }
        }

        show(list);
    }

    public static void xoaMotHocSinhTrongDanhSach(List<HocSinh> list) {
        System.out.println("Nhap ma hoc sinh can xoa thong tin: ");
        String maHSxoa = sc.nextLine();
        for (HocSinh items : list) {
            if (items.getMaHS().equals(maHSxoa)) {
                list.remove(items);
                break;
            }
        }

        show(list);
    }

    public static List<HocSinh> locDanhSachHocSinhTheoLop(List<HocSinh> list) {
        System.out.println("Nhap ten lop: ");
        String lopLoc = sc.nextLine();
        List<HocSinh> subList = list.stream().filter(e -> e.getLop().equals(lopLoc)).collect(Collectors.toList());
        return subList;
    }

    public static void sapXepDanhSachTheoABC(List<HocSinh> list) {
        Comparator<HocSinh> comparator = Comparator.comparing(HocSinh::getTen);
        list.sort(comparator);

        show(list);
    }

    public static <E> void writeJSONFile(List<E> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(JSON_WRITER_PATH);
            Gson gson = new Gson();

            gson.toJson(list, fw);
        } catch (IOException ex) {
            Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.flush();
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(HocSinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Nhap so luong hoc sinh: ");
        int N = sc.nextInt();
        sc.nextLine();
        List<HocSinh> list = new ArrayList<>(N);

        //nhapDanhSachHocSinh
        nhapDanhSachHocSinh(list, N);

        //ThemMotHocSinhvaoDanhSach
        themMotHocSinhvaoDanhSach(list);

        //suaThongTinHocSinh
        suaThongTinHocSinh(list);

        //Xoa mot hoc sinh trong danh sach
        xoaMotHocSinhTrongDanhSach(list);

        //Loc danh sach hoc sinh theo lop
        show(locDanhSachHocSinhTheoLop(list));

        //Sap xep danh sach theo abc
        sapXepDanhSachTheoABC(list);

        //viet ra file JSON
        writeJSONFile(list);
    }
}
