package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n ho dan you want:");
        n = scanner.nextInt();
        scanner.nextLine();
        KhuPho khuPho = new KhuPho();
        HoGiaDinh hoGiaDinh = new HoGiaDinh();

        for (int i=1;i<=n;i++){
            List<Person> personList = new ArrayList<>();
            String id;
            String fullName;
            int age;
            String ngheNghiep;
            int numberPerson;

            System.out.print("so nguoi cua ho dan "+i +" :");
            numberPerson = scanner.nextInt();
            scanner.nextLine();

            for(int j = 1; j<=numberPerson;j++) {
                Person person = new Person();

                System.out.print("enter id:");
                id = scanner.nextLine();
                person.setId(id);

                System.out.print("enter full name:");
                fullName = scanner.nextLine();
                person.setFullName(fullName);

                System.out.print("enter age:");
                age = scanner.nextInt();
                person.setAge(age);
                scanner.nextLine();

                System.out.print("enter nghe nghiep:");
                ngheNghiep = scanner.nextLine();
                person.setNgheNghiep(ngheNghiep);

                personList.add(person);
                hoGiaDinh.setPersonList(personList);
            }
            hoGiaDinh.getPersonList().stream().forEach(System.out::println);
            khuPho.checkHoGiaDinh(hoGiaDinh.getPersonList());
        }
        khuPho.showInforHoGiaDinh();
    }
}
