package com.actvn.qldiemhsthpt;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DiemCuaHSController {
    public static List<DiemCuaHS> compareSubject(List<DiemCuaHS> list, int index) {
        Comparator<DiemCuaHS> comparator;
        if (index >= 0 && index <= 9) {
            comparator = (o1, o2) -> (int) (o2.getTatCaMon().get(index).getDiem_cac_mon() - o1.getTatCaMon().get(index).getDiem_cac_mon());
            list.sort(comparator);
        } else if (index == 10) {
            comparator = Comparator.comparing(DiemCuaHS::getDiemTBmon).reversed();
            list.sort(comparator);
        }
        List<DiemCuaHS> subList = list;
        return subList;
    }

    public static List<DiemCuaHS> filterRanked(List<DiemCuaHS> list, int index) {
        List<DiemCuaHS> subList = null;
        switch (index) {
            case 1 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Giỏi")).collect(Collectors.toList());
            }
            case 2 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Khá")).collect(Collectors.toList());
            }
            case 3 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Trung Bình")).collect(Collectors.toList());
            }
            case 4 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Yếu")).collect(Collectors.toList());
            }
            case 5 -> {
                subList = list.stream().filter(e -> e.getHocLuc().equals("Kém")).collect(Collectors.toList());
            }
        }
        return subList;
    }

    public static List<DiemCuaHS> filterSubject(List<DiemCuaHS> list, int index) {
        List<DiemCuaHS> list1 = list;
        List<DiemCuaHS> list2;
        compareSubject(list1, index);
        if (list1.size() >= 5) {
            list2 = list1.subList(0, 5);
        } else {
            list2 = list1;
        }
        return list2;
    }
}
