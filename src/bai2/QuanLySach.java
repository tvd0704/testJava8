package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class QuanLySach {

    List<TaiLieu> taiLieuList = new ArrayList<>();

    public void addTaiLieu (Sach sach) {
        taiLieuList.add(sach);
    }

    public void remoteTaiLieu (String maTaiLieu) {
        List<TaiLieu> taiLieuList1 = taiLieuList.stream().filter(f ->f.getMaTaiLieu().equals(maTaiLieu)).collect(Collectors.toList());
        taiLieuList.remove(taiLieuList1);
    }

    public void showInforTaiLieu () {
        taiLieuList.stream().forEach(System.out::println);
    }

    public void findSach (List<Bao> baoList, String maTaiLieu) {
      baoList.stream().forEach(System.out::println);
      List<Bao> baoList1 = baoList.stream().filter(f ->f.getMaTaiLieu().equals(maTaiLieu)).collect(Collectors.toList());
    }

    public void findTapChi (List<Sach> sachList , String maTaiLieu) {
            sachList.stream().forEach(System.out::println);
            List<Sach> sachList1 = sachList.stream().filter(f -> f.getMaTaiLieu().equals(maTaiLieu)).collect(Collectors.toList());
    }

    public void findBao (List<TapChi> tapChiList, String maTaiLieu) {
            tapChiList.stream().forEach(System.out::println);
            List<TapChi> tapChiList1 = tapChiList.stream().filter(f ->f.getMaTaiLieu().equals(maTaiLieu)).collect(Collectors.toList());
    }

}
