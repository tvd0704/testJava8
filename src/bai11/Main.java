package bai11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<SoPhuc> soPhucList = new ArrayList<>();
        TwoSoPhuc soPhuc1 = new TwoSoPhuc();
        int select;

        do {
            System.out.println("1.nhap hai so phuc");
            System.out.println("2.hien thi so phuc");
            System.out.println("3.cong 2 so phuc");
            System.out.println("4.nhan 2 so phuc");
            System.out.println("5.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            scanner.nextLine();
            SoPhuc soPhuc = new SoPhuc();

            if (select == 1) {
                double phanThuc;
                double phanAo;

                double phanThuc2;
                double phanAo2;

                System.out.print("enter phan thuc1:");
                phanThuc = scanner.nextDouble();
                scanner.nextLine();
                soPhuc.setPhanThuc(phanThuc);
                soPhuc1.setPhanThuc(phanThuc);

                System.out.print("enter phan ao1:");
                phanAo = scanner.nextDouble();
                scanner.nextLine();
                soPhuc.setPhanAo(phanAo);
                soPhuc1.setPhanAo(phanAo);


                soPhucList.add(soPhuc);

                System.out.print("enter phanthuc2:");
                phanThuc2 = scanner.nextDouble();
                scanner.nextLine();
                soPhuc.setPhanThuc(phanThuc2);
                soPhuc1.setPhanThuc2(phanThuc2);

                System.out.print("enter phan ao2:");
                phanAo2 = scanner.nextDouble();
                scanner.nextLine();
                soPhuc.setPhanAo(phanAo2);
                soPhuc1.setPhanAo2(phanAo2);

                soPhucList.add(soPhuc);

            } else if (select == 2) {
                soPhucList.stream().forEach(System.out::println);

            } else if (select == 3) {
                soPhuc.cong2SoPhuc(soPhuc1.getPhanThuc(), soPhuc1.getPhanAo(), soPhuc1.getPhanThuc2(), soPhuc1.getPhanAo2());
            } else if (select == 4) {
                soPhuc.nhan2SoPhuc(soPhuc1.getPhanThuc(), soPhuc1.getPhanAo(), soPhuc1.getPhanThuc2(), soPhuc1.getPhanAo2());
            }
        } while (select != 5);
    }
}
