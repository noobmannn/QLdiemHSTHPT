package com.actvn.qldiemhsthpt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainTest {

    public static void show(List<HocSinh> list) {
        System.out.println("----------------------");
        System.out.println("Danh Sach Hoc Sinh: ");
        for (HocSinh items : list) {
            System.out.println("Thong Tin Hoc Sinh: ");
            items.xuatThongTin();
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh: ");
        int N = sc.nextInt();
        sc.nextLine();
        List<HocSinh> list = new ArrayList<>(N);

        //nhapDanhSachHocSinh
        for (int i = 0; i < N; i++) {
            System.out.println("Nhap Thong Tin Hoc Sinh Thu " + (i + 1) + ": ");
            HocSinh hs = new HocSinh();
            hs.nhapThongTin();
            list.add(hs);
        }

        show(list);

        //ThemMotHocSinhvaoDanhSach
        System.out.println("Nhap Thong Tin Hoc Sinh Can Them Vao: ");
        HocSinh hsThem = new HocSinh();
        hsThem.nhapThongTin();
        list.add(hsThem);

        show(list);

        //suaThongTinHocSinh
        System.out.println("Nhap ma Hoc Sinh cua Sinh Vien Can Sua: ");
        String maHSsua = sc.nextLine();
        /*
        maHSsua = :
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

        //Xoa mot hoc sinh trong danh sach
        System.out.println("Nhap ma hoc sinh can xoa thong tin: ");
        String maHSxoa = sc.nextLine();
        for (HocSinh items : list) {
            if (items.getMaHS().equals(maHSxoa)) {
                list.remove(items);
                break;
            }
        }

        show(list);

        //Loc danh sach hoc sinh theo lop
        System.out.println("Nhap ten lop: ");
        String lopLoc = sc.nextLine();
        List<HocSinh> subList = list.stream().filter(e -> e.getLop().equals(lopLoc)).collect(Collectors.toList());
        show(subList);

        //Sap xep danh sach theo abc
        Comparator<HocSinh> comparator = Comparator.comparing(HocSinh::getTen);
        list.sort(comparator);

        show(list);
    }
}
