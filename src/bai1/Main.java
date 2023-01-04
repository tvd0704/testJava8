package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select;
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();


        do {

            System.out.println("1.them moi can bo");
            System.out.println("2.tim kiem theo ho ten");
            System.out.println("3.hien thi thong tin ve danh sach can bo");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.print("nhap lua chon cua ban:");
            select = scanner.nextInt();
            scanner.nextLine();

            if (select == 1) {
                int select2;
                do {
                    System.out.println("1.them moi cong nhan");
                    System.out.println("2.them moi nhan vien");
                    System.out.println("3.them moi ky su");
                    System.out.println("4.thoat khoi chuong trinh");
                    System.out.print("nhap lua chon cua ban:");
                    select2 = scanner.nextInt();
                    scanner.nextLine();
                    if (select2 == 1) {
                        String fullName;
                        int age;
                        String sex;
                        String address;
                        int level;

                        CongNhan congNhan = new CongNhan();
                        System.out.print("enter fullname:");
                        fullName = scanner.nextLine();
                        congNhan.setFullName(fullName);

                        System.out.print("enter age:");
                        age = scanner.nextInt();
                        congNhan.setAge(age);
                        scanner.nextLine();

                        System.out.print("enter sex:");
                        sex = scanner.nextLine();
                        congNhan.setSex(sex);

                        System.out.print("enter address:");
                        address = scanner.nextLine();
                        congNhan.setAddress(address);

                        System.out.print("enter level:");
                        level = scanner.nextInt();
                        scanner.nextLine();
                        congNhan.setLevel(level);

                        quanLyCanBo.addCanBo(congNhan);

                    } else {
                        if (select2 == 2) {
                            String fullName;
                            int age;
                            String sex;
                            String address;
                            String work;

                            NhanVien nhanVien = new NhanVien();

                            System.out.print("enter full name:");
                            fullName = scanner.nextLine();
                            nhanVien.setFullName(fullName);

                            System.out.print("enter age:");
                            age = scanner.nextInt();
                            scanner.nextLine();
                            nhanVien.setAge(age);

                            System.out.print("enter sex:");
                            sex = scanner.nextLine();
                            nhanVien.setSex(sex);

                            System.out.print("enter address:");
                            address = scanner.nextLine();
                            nhanVien.setAddress(address);

                            System.out.print("enter work:");
                            work = scanner.nextLine();
                            nhanVien.setWork(work);

                            quanLyCanBo.addCanBo(nhanVien);
                        } else {
                            if (select2 == 3) {
                                String fullName;
                                int age;
                                String sex;
                                String address;
                                String major;

                                KySu kySu = new KySu();

                                System.out.print("enter fullname:");
                                fullName = scanner.nextLine();
                                kySu.setFullName(fullName);

                                System.out.print("enter age:");
                                age = scanner.nextInt();
                                scanner.nextLine();
                                kySu.setAge(age);

                                System.out.print("enter sex:");
                                sex = scanner.nextLine();
                                kySu.setSex(sex);

                                System.out.print("enter address:");
                                address = scanner.nextLine();
                                kySu.setAddress(address);

                                System.out.print("enter major:");
                                major = scanner.nextLine();
                                kySu.setMajor(major);

                                quanLyCanBo.addCanBo(kySu);
                            }
                        }
                    }


                } while (select2 != 4);

            } else if (select == 2) {
                String fullName;
                System.out.print("enter full name:");
                fullName = scanner.nextLine();
                quanLyCanBo.findFullName(fullName);

            } else if (select == 3) {
                quanLyCanBo.showInforCanBo();
            }

        } while (select != 4);


    }
}
