package bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int select;
        Scanner scanner = new Scanner(System.in);
        List<TrungTam> trungTamList = new ArrayList<>();

        do {
            System.out.println("1.them sinh vien muon sach");
            System.out.println("2.xoa theo ma phieu muon");
            System.out.println("3.hien thi thong tin cac the muon");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            TrungTam trungTam = new TrungTam();
            if(select == 1) {
                Student student = new Student();
                The the = new The();
                String fullName;
                int age;
                String lop;

                String maPhieuMuon;
                int ngayMuon;
                int hanTra;
                String soHieuSach;

                System.out.print("enter fullname:");
                fullName = scanner.nextLine();
                student.setFullName(fullName);

                System.out.print("enter age:");
                age = scanner.nextInt();
                scanner.nextLine();
                student.setAge(age);

                System.out.print("enter lop:");
                lop = scanner.nextLine();
                student.setLop(lop);

                trungTam.setStudent(student);

                System.out.print("enter ma phieu muon:");
                maPhieuMuon = scanner.nextLine();
                the.setMaPhieuMuon(maPhieuMuon);

                System.out.print("enter ngay muon:");
                ngayMuon = scanner.nextInt();
                scanner.nextLine();
                the.setNgayMuon(ngayMuon);

                System.out.print("enter han tra:");
                hanTra = scanner.nextInt();
                scanner.nextLine();
                the.setHanTra(hanTra);

                System.out.print("enter so hieu sach:");
                soHieuSach = scanner.nextLine();
                the.setSoHieuSach(soHieuSach);

                trungTam.setThe(the);

                trungTamList.add(trungTam);

            } else if (select == 2) {
                String maPhieuMuon;
                System.out.print("enter ma phieu muon:");
                maPhieuMuon = scanner.nextLine();
                trungTamList.removeIf(f->f.getThe().getMaPhieuMuon().equals(maPhieuMuon));
            } else if (select == 3) {
                trungTamList.stream().forEach(System.out::println);
            }
        }while (select!=4);
    }
}
