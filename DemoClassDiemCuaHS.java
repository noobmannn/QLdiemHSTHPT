package com.actvn.qldiemhsthpt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class DemoClassDiemCuaHS {

    static Scanner sc = new Scanner(System.in);

    static void arrayDiem(double[] d) {
        System.out.println("Nhap diem cho cac mon: ");
        System.out.println("Nhap diem mon Toan: ");
        d[0] = sc.nextDouble();
        System.out.println("Nhap diem mon Vat Ly: ");
        d[1] = sc.nextDouble();
        System.out.println("Nhap diem mon Hoa Hoc: ");
        d[2] = sc.nextDouble();
        System.out.println("Nhap diem mon Sinh Hoc: ");
        d[3] = sc.nextDouble();
        System.out.println("Nhap diem mon Tin Hoc: ");
        d[4] = sc.nextDouble();
        System.out.println("Nhap diem mon Cong Nghe: ");
        d[5] = sc.nextDouble();
        System.out.println("Nhap diem mon Ngu Van: ");
        d[6] = sc.nextDouble();
        System.out.println("Nhap diem mon Dia Ly: ");
        d[7] = sc.nextDouble();
        System.out.println("Nhap diem mon Lich Su: ");
        d[8] = sc.nextDouble();
        System.out.println("Nhap diem mon Giao Duc Cong Dan: ");
        d[9] = sc.nextDouble();
        sc.nextLine();
    }

    public static void show(List<DiemCuaHS> list) {
        for (DiemCuaHS item : list) {
            item.xuatThongTin();
        }
    }

    public static void compareSubject(List<DiemCuaHS> list, int index) {
        Comparator<DiemCuaHS> comparator;
        if (index >= 0 && index <= 9) {
            comparator = (o1, o2) -> (int) (o1.getTatCaMon().get(index).getDiem_cac_mon() - o2.getTatCaMon().get(index).getDiem_cac_mon());
            list.sort(comparator);
        } else if (index == 10) {
            comparator = Comparator.comparing(DiemCuaHS::getDiemTBmon);
            list.sort(comparator);
        }
    }

    public static void filterRanked(List<DiemCuaHS> list, int index) {
        List<DiemCuaHS> subList;
        switch (index) {
            case 1 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Gioi")).collect(Collectors.toList());
                show(subList);
            }
            case 2 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Kha")).collect(Collectors.toList());
                show(subList);
            }
            case 3 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Trung Binh")).collect(Collectors.toList());
                show(subList);
            }
            case 4 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Yeu")).collect(Collectors.toList());
                show(subList);
            }
            case 5 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Kem")).collect(Collectors.toList());
                show(subList);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap so luong hoc sinh: ");
        int N = sc.nextInt();
        sc.nextLine();
        List<DiemCuaHS> list = new ArrayList<>(N);
        String masvv;

        //nhapDanhSachDiem
        for (int i = 0; i < N; i++) {
            System.out.println("Nhap ma sinh vien: ");
            masvv = sc.nextLine();
            double d[] = new double[10];
            DiemCuaHS tmp = new DiemCuaHS(masvv);
            tmp.setMaHS(masvv);
            arrayDiem(d);
            tmp.nhapDiem(d);
            tmp.DiemTb();
            list.add(tmp);
        }

        show(list);

        //themMotSinhVienVaoDanhSach
        System.out.println("Nhap Thong Tin Hoc Sinh Can Them Vao: ");
        String masvvv = sc.nextLine();
        double daad[] = new double[10];
        DiemCuaHS tmp = new DiemCuaHS(masvvv);
        arrayDiem(daad);
        tmp.nhapDiem(daad);
        tmp.DiemTb();
        list.add(tmp);
        show(list);

        //suaDiemChoMotSinhVien
        System.out.println("Nhap ma Hoc Sinh cua Sinh Vien Can Sua Diem: ");
        String maHSsua = sc.nextLine();
        /*
        tt = :
        0. Toan
        1. Vat Ly
        2. Hoa Hoc
        3. Sinh Hoc
        4. Tin Hoc
        5. Cong Nghe
        6. Ngu Van
        7. Dia Ly
        8. Lich Su
        9. Giao Duc Cong Dan
         */
        for (DiemCuaHS item : list) {
            if (item.getMaHS().equals(maHSsua)) {
                System.out.println("Chon mon can sua diem: ");
                int tt = sc.nextInt();
                System.out.println("Nhap diem can sua: ");
                double diemMoi = sc.nextDouble();
                sc.nextLine();
                item.suaDiem(tt, diemMoi);
                break;
            }
        }

        show(list);

        //Xoa mot hoc sinh trong danh sach
        System.out.println("Nhap ma hoc sinh can xoa thong tin: ");
        String maHSxoa = sc.nextLine();
        for (DiemCuaHS items : list) {
            if (items.getMaHS().equals(maHSxoa)) {
                list.remove(items);
                break;
            }
        }

        show(list);

        //Sap xep diem theo tung mon
        /*
        0. Toan
        1. Vat Ly
        2. Hoa Hoc
        3. Sinh Hoc
        4. Tin Hoc
        5. Cong Nghe
        6. Ngu Van
        7. Dia Ly
        8. Lich Su
        9. Giao Duc Cong Dan
        10. Sap xep theo diem trung binh
         */
        System.out.println("Sap xep danh sach theo mon hoc: ");
        System.out.println("Nhap mon hoc can sap xep: ");
        int i1 = sc.nextInt();
        compareSubject(list, i1);

        show(list);

        //Loc danh sach hoc sinh theo hoc luc
        /*
        1. Gioi
        2. Kha
        3. Trung binh
        4. Yeu
        5. Kem
         */
        System.out.println("Loc danh sach hoc sinh theo hoc luc: ");
        int i2 = sc.nextInt();
        filterRanked(list, i2);
    }
}
