package bai12;

import java.security.interfaces.XECKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int select;
        Scanner scanner = new Scanner(System.in);

        List<Oto> otoList = new ArrayList<>();

        List<PhuongTienGiaoThong> phuongTienGiaoThongList = new ArrayList<>();


        do {
            System.out.println("1.them phuong tien");
            System.out.println("2.xoa phuong tien theo id");
            System.out.println("3.tim cac phuong tien theo hang san xuat mau");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            scanner.nextLine();

            if (select == 1) {
                int select2;
                do {
                    System.out.println("1.add oto");
                    System.out.println("2.add xe may");
                    System.out.println("3.add xe tai");
                    System.out.println("4.thoat khoi chuong trinh");
                    System.out.print("select you want:");
                    select2 = scanner.nextInt();
                    scanner.nextLine();

                    if (select2 == 1) {
                        QLPTGT qlptgt = new QLPTGT();
                        Oto oto = new Oto();
                        String id;
                        String hangSanXuat;
                        String namSanXuat;
                        double giaBan;
                        String mauXe;
                        int soNguoi;
                        String kieuDongCo;

                        System.out.print("enter id:");
                        id = scanner.nextLine();
                        oto.setId(id);

                        System.out.print("enter hang san xuat:");
                        hangSanXuat = scanner.nextLine();
                        oto.setHangSanXuat(hangSanXuat);

                        System.out.print("enter nam san xuat:");
                        namSanXuat = scanner.nextLine();
                        oto.setNamSanXuat(namSanXuat);

                        System.out.print("enter gia ban:");
                        giaBan = scanner.nextDouble();
                        scanner.nextLine();
                        oto.setGiaBan(giaBan);

                        System.out.print("enter mau xe:");
                        mauXe = scanner.nextLine();
                        oto.setMauXe(mauXe);

                        System.out.print("enter so nguoi:");
                        soNguoi = scanner.nextInt();
                        scanner.nextLine();
                        oto.setSoSoNgoi(soNguoi);

                        System.out.print("enter kieu dong co:");
                        kieuDongCo = scanner.nextLine();
                        oto.setKieuDongCo(kieuDongCo);

                        qlptgt.setOto(oto);

                        phuongTienGiaoThongList.add(oto);


                    } else if (select2 == 2) {
                        QLPTGT qlptgt = new QLPTGT();
                        XeMay xeMay = new XeMay();
                        String id;
                        String hangSanXuat;
                        String namSanXuat;
                        double giaBan;
                        String mauXe;
                        double congSuat;


                        System.out.print("enter id:");
                        id = scanner.nextLine();
                        xeMay.setId(id);

                        System.out.print("enter hang san xuat:");
                        hangSanXuat = scanner.nextLine();
                        xeMay.setHangSanXuat(hangSanXuat);

                        System.out.print("enter nam san xuat:");
                        namSanXuat = scanner.nextLine();
                        xeMay.setNamSanXuat(namSanXuat);

                        System.out.print("enter gia ban:");
                        giaBan = scanner.nextDouble();
                        scanner.nextLine();
                        xeMay.setGiaBan(giaBan);

                        System.out.print("enter mau xe:");
                        mauXe = scanner.nextLine();
                        xeMay.setMauXe(mauXe);

                        System.out.print("enter cong suat:");
                        congSuat = scanner.nextDouble();
                        xeMay.setCongSuat(congSuat);

                        qlptgt.setXeMay(xeMay);
                        phuongTienGiaoThongList.add(xeMay);


                    } else if (select2 == 3) {
                        QLPTGT qlptgt = new QLPTGT();

                        XeTai xeTai = new XeTai();

                        String id;
                        String hangSanXuat;
                        String namSanXuat;
                        double giaBan;
                        String mauXe;
                        double trongTai;

                        System.out.print("enter id:");
                        id = scanner.nextLine();
                        xeTai.setId(id);

                        System.out.print("enter hang san xuat:");
                        hangSanXuat = scanner.nextLine();
                        xeTai.setHangSanXuat(hangSanXuat);

                        System.out.print("enter nam san xuat:");
                        namSanXuat = scanner.nextLine();
                        xeTai.setNamSanXuat(namSanXuat);

                        System.out.print("enter gia ban:");
                        giaBan = scanner.nextDouble();
                        scanner.nextLine();
                        xeTai.setGiaBan(giaBan);

                        System.out.print("enter mau xe:");
                        mauXe = scanner.nextLine();
                        scanner.nextLine();
                        xeTai.setMauXe(mauXe);

                        System.out.print("enter trong tai");
                        trongTai = scanner.nextDouble();
                        scanner.nextLine();
                        xeTai.setTrongTai(trongTai);


                        qlptgt.setXeTai(xeTai);

                        phuongTienGiaoThongList.add(xeTai);


                    }

                } while (select2 != 4);
            } else if (select == 2) {

                String id;
                System.out.print("enter id:");
                id = scanner.nextLine();

                phuongTienGiaoThongList.removeIf(f -> f.getId().equals(id));
            } else if (select == 3) {
                String hangsanXuat;
                String mau;
                System.out.print("enter hang san xuat:");
                hangsanXuat = scanner.nextLine();

                System.out.print("enter mau:");
                mau = scanner.nextLine();

                phuongTienGiaoThongList.stream().filter(f -> (f.getHangSanXuat().equals(hangsanXuat)) && (f.getMauXe().equals(mau))).collect(Collectors.toList());

            }


        } while (select != 4);


    }
}
