package com.actvn.qldiemhsthpt.model;

import com.actvn.qldiemhsthpt.model.HocSinh;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HocSinhController {
    public static List<HocSinh> locDanhSachHocSinhTheoLop(List<HocSinh> list, String lopLoc) {
        List<HocSinh> subList = list.stream().filter(e -> e.getLop().equals(lopLoc)).collect(Collectors.toList());
        return subList;
    }

    public static void sapXepDanhSachTheoABC(List<HocSinh> list) {
        Comparator<HocSinh> comparator = Comparator.comparing(HocSinh::getTen);
        list.sort(comparator);
    }
}
