package bai14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Integer test = new Integer(5);
        Integer test2 = new Integer(10);
        test2.compareTo(test);

        int numberStudent;
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong nhan vien can tuyen:");
        numberStudent = scanner.nextInt();
        scanner.nextLine();

        if (numberStudent < 11 || numberStudent > 15) {
            System.out.println("so luong can tuyen 11<=nhan vien<=15");
            System.out.println("nhap lai so luong nhan vien");
            numberStudent = scanner.nextInt();
            scanner.nextLine();
        }

        int select;

        do {
            System.out.println("1.add student");
            System.out.println("2.thoat nhap");
            select = scanner.nextInt();
            scanner.nextLine();
            if(select == 1) {

                String fullName;
                String doB;
                String sex;
                String phoneNumber;
                String univercityName;
                String gradeLevel;

                System.out.print("enter full name:");
                fullName = scanner.nextLine();

                System.out.print("enter date of birth:");
                doB = scanner.nextLine();

                System.out.print("enter sex:");
                sex = scanner.nextLine();

                System.out.print("enter phone number:");
                phoneNumber = scanner.nextLine();

                System.out.print("enter univercity name:");
                univercityName = scanner.nextLine();

                System.out.print("enter grade level");
                gradeLevel = scanner.nextLine();

            }

        }while (select!=2);




        }
    }
