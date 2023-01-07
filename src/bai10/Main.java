package bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String xauKyTu;
        int select;
        Scanner scanner = new Scanner(System.in);
        VanBan vanBan = new VanBan();

        do {
            System.out.println("1.Nhap van ban");
            System.out.println("2.Dem so ky tu cua van ban");
            System.out.println("3.Dem so ky tu a va A trong van ban");
            System.out.println("4.Chuan hoa van ban");
            System.out.println("5.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            scanner.nextLine();
            if(select == 1) {
                System.out.print("nhap xau ky tu:");
                xauKyTu = scanner.nextLine();
                vanBan.setXauKyTu(xauKyTu);
            } else if (select ==2) {
                vanBan.demSoTuCuaVanBan();
            } else if (select == 3) {
                vanBan.demSoTuA();
            } else if (select == 4) {
                vanBan.chuanHoaXauKyTu();
            }
        }while (select!=5);




    }
}
