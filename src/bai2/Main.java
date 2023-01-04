package bai2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int select;
        Scanner scanner = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        List<Bao> baoList = new ArrayList<>();
        List<Sach> sachList = new ArrayList<>();
        List<TapChi> tapChiList = new ArrayList<>();

        do {
            System.out.println("1.them moi tai lieu");
            System.out.println("2.xoa thong tin tai lieu");
            System.out.println("3.hien thi thong tin tai lieu");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.println("5.tim kiem tai lieu theo sach, bao, tap chi");
            System.out.println("6.thoat khoi chuong trinh");
            System.out.print("enter lua chon:");
            select = scanner.nextInt();
            scanner.nextLine();
            int select2;
            if (select == 1) {
                do {
                    System.out.println("1.them bao");
                    System.out.println("2.them sach");
                    System.out.println("3.them tap chi");
                    System.out.println("4.thoat khoi chuong trinh");
                    System.out.print("enter lua chon");
                    select2 = scanner.nextInt();
                    scanner.nextLine();
                    if (select2 == 1) {
                        Bao bao = new Bao();
                        String maTaiLieu;
                        String tenNhaXuatBan;
                        int soBanPhatHanh;

                        System.out.print("enter maTaiLieu:");
                        maTaiLieu = scanner.nextLine();
                        bao.setMaTaiLieu(maTaiLieu);

                        quanLyTaiLieu.checkForDuplicate(maTaiLieu);

                        System.out.print("enter ten nha xuat ban:");
                        tenNhaXuatBan = scanner.nextLine();
                        bao.setTenNhaXuatBan(tenNhaXuatBan);

                        System.out.println("enter so ban phat hanh:");
                        soBanPhatHanh = scanner.nextInt();
                        bao.setSoBanPhatHanh(soBanPhatHanh);
                        scanner.nextLine();

                        System.out.println("ngay phat hanh trong thang nay:");
                        LocalDate localDate = LocalDate.now();
                        int day = localDate.getDayOfMonth() + 1;
                        bao.setNgayPhatHanh(day);

                        quanLyTaiLieu.addTaiLieu(bao);
                        baoList.add(bao);
                    }

                    if (select2 == 2) {

                        Sach sach = new Sach();
                        String maTaiLieu;
                        String tenNhaXuatBan;
                        int soBanPhatHanh;
                        String tenTacGia;
                        int soTrang;

                        System.out.print("enter ma tai lieu:");
                        maTaiLieu = scanner.nextLine();
                        sach.setMaTaiLieu(maTaiLieu);

                        quanLyTaiLieu.checkForDuplicate(maTaiLieu);

                        System.out.print("enter ten nha xuat ban:");
                        tenNhaXuatBan = scanner.nextLine();
                        sach.setTenNhaXuatBan(tenNhaXuatBan);

                        System.out.print("enter so ban phat hanh:");
                        soBanPhatHanh = scanner.nextInt();
                        scanner.nextLine();
                        sach.setSoBanPhatHanh(soBanPhatHanh);

                        System.out.print("enter ten tac gia:");
                        tenTacGia = scanner.nextLine();
                        sach.setTenTacGia(tenTacGia);

                        System.out.print("enter so trang:");
                        soTrang = scanner.nextInt();
                        scanner.nextLine();
                        sach.setSoTrang(soTrang);

                        sachList.add(sach);
                        quanLyTaiLieu.addTaiLieu(sach);
                    } else if (select2 == 3) {

                        TapChi tapChi = new TapChi();
                        String maTaiLieu;
                        String tenNhaXuatBan;
                        int soBanPhatHanh;
                        int soPhatHanh;
                        int thangPhatHanh;

                        System.out.print("enter ma tai lieu:");
                        maTaiLieu = scanner.nextLine();
                        tapChi.setMaTaiLieu(maTaiLieu);

                        quanLyTaiLieu.checkForDuplicate(maTaiLieu);

                        System.out.print("enter ten nha xuat ban:");
                        tenNhaXuatBan = scanner.nextLine();
                        tapChi.setTenNhaXuatBan(tenNhaXuatBan);

                        System.out.print("enter so ban phat hanh:");
                        soBanPhatHanh = scanner.nextInt();
                        scanner.nextLine();
                        tapChi.setSoBanPhatHanh(soBanPhatHanh);

                        System.out.print("enter so phat hanh:");
                        soPhatHanh = scanner.nextInt();
                        scanner.nextLine();
                        tapChi.setSoPhatHanh(soPhatHanh);

                        LocalDate localDate = LocalDate.now();
                        thangPhatHanh = localDate.getMonthValue();
                        tapChi.setThangPhatHanh(thangPhatHanh);

                        tapChiList.add(tapChi);
                        quanLyTaiLieu.addTaiLieu(tapChi);
                    }
                } while (select2 != 4);
            } else if (select == 2) {
                String maTaiLieu;
                System.out.print("enter ma tai lieu:");
                maTaiLieu = scanner.nextLine();
                quanLyTaiLieu.remoteTaiLieu(maTaiLieu);
            } else if (select == 3) {
                quanLyTaiLieu.showInforTaiLieu();
            } else if (select == 4) {
                int select3 = 0;
                do {
                    System.out.println("1.tim bao");
                    System.out.println("2.tim sach");
                    System.out.println("3.tim tap chi");
                    System.out.println("4.thoat khoi chuong trinh");
                    System.out.println("enter lua chon:");
                    select3 = scanner.nextInt();
                    scanner.nextLine();
                    if (select3 == 1) {
                        String maTaiLieu;
                        System.out.print("enter ma tai lieu:");
                        maTaiLieu = scanner.nextLine();
                        quanLyTaiLieu.findBao(baoList, maTaiLieu);
                    } else if (select3 == 2) {
                        String maTaiLieu;
                        System.out.print("enter ma tai lieu");
                        maTaiLieu = scanner.nextLine();
                        quanLyTaiLieu.findSach(sachList, maTaiLieu);
                    } else if (select3 == 3) {
                        String maTaiLieu;
                        System.out.print("enter ma tai lieu");
                        maTaiLieu = scanner.nextLine();
                        quanLyTaiLieu.findTapChi(tapChiList, maTaiLieu);
                    }

                } while (select3 != 4);
            }


        } while (select != 6);


    }
}
