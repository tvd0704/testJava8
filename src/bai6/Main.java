package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int select;
        Scanner scanner = new Scanner(System.in);


        List<School> schools = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();


        do {
            System.out.println("1.Them hoc sinh moi");
            System.out.println("2.Hien thi cac hoc sinh 20 tuoi");
            System.out.println("3.Cho biet so luong hoc sinh co tuoi la 23 va que o Da Nang");
            System.out.println("4.thoat khoi chuong trinh");
            System.out.print("enter select you want:");
            select = scanner.nextInt();
            scanner.nextLine();

            School school = new School();

            if (select == 1) {

                Student student = new Student();
                String fullName;
                int age;
                String homeTowl;
                String lop;

                System.out.print("enter full name:");
                fullName = scanner.nextLine();
                student.setFullName(fullName);

                System.out.print("enter age:");
                age = scanner.nextInt();
                scanner.nextLine();
                student.setAge(age);

                System.out.print("enter home towl:");
                homeTowl = scanner.nextLine();
                student.setHomeTowl(homeTowl);

                school.setStudent(student);

                System.out.print("enter class for student:");
                lop = scanner.nextLine();
                school.setLop(lop);

                schools.add(school);

                studentList.add(student);

            } else if (select == 2) {
                schools.stream().filter(f -> f.getStudent().getAge() >= 20).forEach(System.out::println);
            } else if (select == 3) {
                schools.stream().filter(f -> (f.getStudent().getAge() >= 20 && f.getStudent().getHomeTowl().equals("DaNang")))
                        .forEach(System.out::println);
            }

        } while (select != 4);


    }
}
