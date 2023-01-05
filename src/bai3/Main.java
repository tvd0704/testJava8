package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int select;
        QuanLyStudent quanLyStudent = new QuanLyStudent();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Them moi thi sinh");
            System.out.println("2.Hien thi thong tin thi sinh va khoi thi cua thi sinh");
            System.out.println("3.Tim kiem theo so bao danh");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            scanner.nextLine();
            if(select == 1) {
                System.out.println("1.Them thi sinh khoi A");
                System.out.println("2.Them thi sinh khoi B");
                System.out.println("3.Them thi sinh khoi C");
                System.out.println("4.Thoat khoi chuong trinh");
                int select2;
                System.out.print("enter select you want:");
                select2 = scanner.nextInt();
                scanner.nextLine();
                if(select2 == 1) {
                    A a = new A();
                    String soBaoDanh;
                    String fullName;
                    String address;
                    int mucUuTien;

                    System.out.print("enter so bao danh:");
                    soBaoDanh = scanner.nextLine();
                    a.setSoBaoDanh(soBaoDanh);

                    System.out.print("enter full name:");
                    fullName = scanner.nextLine();
                    a.setFullName(fullName);

                    System.out.print("enter address:");
                    address = scanner.nextLine();
                    a.setAddress(address);

                    System.out.print("enter muc uu tien:");
                    mucUuTien = scanner.nextInt();
                    scanner.nextLine();
                    a.setMucUuTien(mucUuTien);

                    quanLyStudent.addStudent(a);
                } else if (select2 == 2) {

                    B b = new B();
                    String soBaoDanh;
                    String fullName;
                    String address;
                    int mucUuTien;

                    System.out.print("enter so bao danh:");
                    soBaoDanh = scanner.nextLine();
                    b.setSoBaoDanh(soBaoDanh);

                    System.out.print("enter full name:");
                    fullName = scanner.nextLine();
                    b.setFullName(fullName);

                    System.out.print("enter address:");
                    address = scanner.nextLine();
                    b.setAddress(address);

                    System.out.print("enter muc uu tien:");
                    mucUuTien = scanner.nextInt();
                    scanner.nextLine();
                    b.setMucUuTien(mucUuTien);

                    quanLyStudent.addStudent(b);
                } else if (select2 == 3) {

                    C c = new C();
                    String soBaoDanh;
                    String fullName;
                    String address;
                    int mucUuTien;

                    System.out.print("enter so bao danh:");
                    soBaoDanh = scanner.nextLine();
                    c.setSoBaoDanh(soBaoDanh);

                    System.out.print("enter full name:");
                    fullName = scanner.nextLine();
                    c.setFullName(fullName);

                    System.out.print("enter address:");
                    address = scanner.nextLine();
                    c.setAddress(address);

                    System.out.print("enter muc uu tien:");
                    mucUuTien = scanner.nextInt();
                    scanner.nextLine();
                    c.setMucUuTien(mucUuTien);

                    quanLyStudent.addStudent(c);
                }
            } else if (select == 2) {
                quanLyStudent.showInforStudent();
            } else if (select == 3) {
                String soBaoDanh;
                System.out.print("enter so bao danh:");
                soBaoDanh = scanner.nextLine();
                quanLyStudent.findStudentById(soBaoDanh);
            }
        }while (select!=4);

    }
}
