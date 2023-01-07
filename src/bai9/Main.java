package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int select;
        Scanner scanner = new Scanner(System.in);
        List<BienLai> bienLais = new ArrayList<>();

        do {
            System.out.println("1.them ho su dung dien");
            System.out.println("2.xoa thong tin ho su dung dien");
            System.out.println("3.tinh tien dien cho ho gia dinh");
            System.out.println("4.enter select you want:");
            select = scanner.nextInt();



            if(select == 1) {
                KhachHang khachHang = new KhachHang();
                BienLai bienLai = new BienLai();
                String fullName;
                int soNha;
                String maCongToDien;
                int chiSoDienMoi;
                int chiSoDienCu;
                int soTienPhaiTra;

                System.out.print("enter full name:");
                fullName = scanner.nextLine();
                khachHang.setFullName(fullName);

                System.out.print("enter so nha:");
                soNha = scanner.nextInt();
                scanner.nextLine();
                khachHang.setSoNha(soNha);


                System.out.print("enter ma cong to dien:");
                maCongToDien = scanner.nextLine();
                khachHang.setMaCongToDien(maCongToDien);

                bienLai.setKhachHang(khachHang);

                System.out.print("enter cho so dien moi:");
                chiSoDienMoi = scanner.nextInt();
                scanner.nextLine();
                bienLai.setChiSoDienMoi(chiSoDienMoi);

                System.out.print("enter chi so dien cu:");
                chiSoDienCu = scanner.nextInt();
                bienLai.setChiSoDienCu(chiSoDienCu);

                soTienPhaiTra = (chiSoDienMoi - chiSoDienCu) *5;

                bienLai.setSoTienPhaiTra(soTienPhaiTra);


                bienLais.add(bienLai);

            } else if (select == 2) {
                int soNha;
                System.out.print("enter so nha:");
                soNha = scanner.nextInt();
                scanner.nextLine();

                bienLais.removeIf(f ->f.getKhachHang().getSoNha()==soNha);
            } else if (select ==3) {
                int soNha;
                System.out.print("enter so nha:");
                soNha = scanner.nextInt();
                scanner.nextLine();
                System.out.print("nhap so nha muon tinh tien:");
                bienLais.stream().filter(f ->f.getKhachHang().getSoNha()==soNha).collect(Collectors.toList());
            }
        }while (select!=4);


    }
}
