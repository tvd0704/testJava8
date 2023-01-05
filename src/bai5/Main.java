package bai5;

import bai3.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int select;
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        do {
            System.out.println("1.them moi khach hang");
            System.out.println("2.xoa khach theo so chung minh nhan dan");
            System.out.println("3.tinh tien thue phong cho khach");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            scanner.nextLine();
            if (select == 1) {
                int number;
                System.out.print("enter so nguoi o cung 1 phong:");
                number = scanner.nextInt();
                scanner.nextLine();
                List<Person> personList = new ArrayList<>();
                for (int i = 1; i <= number; i++) {
                    Person person = new Person();
                    String fullName;
                    int age;
                    String id;

                    System.out.print("enter full name:");
                    fullName = scanner.nextLine();
                    person.setFullName(fullName);

                    System.out.print("enter age:");
                    age = scanner.nextInt();
                    scanner.nextLine();
                    person.setAge(age);

                    System.out.print("enter id:");
                    id = scanner.nextLine();
                    person.setId(id);

                    personList.add(person);
                }
                hotel.setPersonList(personList);
                String loaiPhong;
                System.out.print("enter loai phong:");
                loaiPhong = scanner.nextLine();


                if (loaiPhong.equals("A")) {
                    LoaiPhong loaiPhong1 = LoaiPhong.A;
                    hotel.setLoaiPhong(loaiPhong1);
                } else if (loaiPhong.equals("B")) {
                    LoaiPhong loaiPhong1 = LoaiPhong.B;
                    hotel.setLoaiPhong(loaiPhong1);
                } else if (loaiPhong.equals("C")) {
                    LoaiPhong loaiPhong1 = LoaiPhong.C;
                    hotel.setLoaiPhong(loaiPhong1);
                }
                ;
                int soNgayThue;
                System.out.print("enter so ngay thue: ");
                soNgayThue = scanner.nextInt();
                scanner.nextLine();
                hotel.setSoNgayThue(soNgayThue);

            }
            else if (select == 2) {
                String id;
                System.out.print("enter id person you delete:");
                id = scanner.nextLine();
                hotel.deletePerson(id);
                System.out.println(hotel.toString());
            } else if (select == 3) {
                String id;
                System.out.print("enter id person pay for hotel:");
                id = scanner.nextLine();
                hotel.tinhTien(id);
            }
        } while (select != 4);
    }
}
