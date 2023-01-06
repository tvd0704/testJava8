package bai7;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int select;
        Scanner scanner = new Scanner(System.in);

        List<CBNV> cbnvList = new ArrayList<>();




        do {
            System.out.println("1.Them nhan vien");
            System.out.println("2.xoa can bo nhan vien");
            System.out.println("3.Tinh luong thuc linh cho giao vien");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            CBNV cbnv = new CBNV();
            if(select ==1) {
                Person person = new Person();
                String fullName;
                int age;
                String homeTowl;
                String id;
                float luongCung;
                float luongThuong;
                float tienPhat;
                float luongThucLinh;


                System.out.print("enter fullname:");
                fullName = scanner.nextLine();
                person.setFullName(fullName);

                System.out.print("enter age:");
                age = scanner.nextInt();
                scanner.nextLine();
                person.setAge(age);

                System.out.print("enter hometowl:");
                homeTowl = scanner.nextLine();
                person.setHomeTowl(homeTowl);

                System.out.print("enter id:");
                id = scanner.nextLine();
                person.setId(id);

                cbnv.setPerson(person);

                System.out.print("enter luong cung:");
                luongCung = scanner.nextFloat();
                scanner.nextLine();
                cbnv.setLuongCung(luongCung);

                System.out.print("enter luong thuong");
                luongThuong = scanner.nextFloat();
                scanner.nextLine();
                cbnv.setLuongThuong(luongThuong);

                System.out.print("enter tien phat:");
                tienPhat = scanner.nextFloat();
                scanner.nextLine();
                cbnv.setTienPhat(tienPhat);

                luongThucLinh = luongCung +luongThuong - tienPhat;
                cbnv.setLuongThucLinh(luongThucLinh);
                
            } else if (select == 2) {
                String id;
                System.out.print("enter id person you want to delete:");
                id = scanner.nextLine();
                cbnvList.removeIf(f ->f.getPerson().getId().equals(id));
            }


        }while (select!=4);


    }
}
