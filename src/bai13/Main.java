package bai13;

import bai13.exception.BirthDayException;
import bai13.exception.EmailException;
import bai13.exception.FullNameException;
import bai13.exception.PhoneException;
import bai13.regex.BirthDayRegex;
import bai13.regex.EmailRegex;
import bai13.regex.FullNameRegex;
import bai13.regex.PhoneRegex;
import bai3.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Experience> experienceList = new ArrayList<>();
        List<Fresher> fresherList = new ArrayList<>();
        List<Intern> internList = new ArrayList<>();

        int select;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.them nhan vien");
            System.out.println("2.chinh sua thong tin cua nhan vien");
            System.out.println("3.xoa thong tin cua nhan vien");
            System.out.println("4.tim tat ca nhan vien intern");
            System.out.println("5.tim tat ca nhan vien experience");
            System.out.println("6.tim tat ca nhan vien fresher");
            System.out.println("7.thoat khoi chuong trinh");
            select = scanner.nextInt();
            scanner.nextLine();

            if (select == 1) {

                Employee employee = new Employee();
                Experience experience = new Experience();
                Fresher fresher = new Fresher();
                Intern intern = new Intern();

                String id;
                String fullName;
                String birthDay;
                String phone;
                String email;
                int employeeType;


                System.out.print("enter id:");
                id = scanner.nextLine();
                employee.setId(id);

                System.out.print("enter full name:");
                fullName = scanner.nextLine();
                employee.setFullNane(fullName);
                if (!FullNameRegex.isFullname(fullName)) {
                    throw new FullNameException("wrong format for full name");
                }


                System.out.print("enter birthday:");
                birthDay = scanner.nextLine();
                employee.setBirthDay(birthDay);
                if (!BirthDayRegex.isBirthDayRegex(birthDay)) {
                    throw new BirthDayException("wrong format for birthday");
                }

                System.out.print("enter email:");
                email = scanner.nextLine();
                employee.setEmail(email);
                if (!EmailRegex.isEmailRegex(email)) {
                    throw new EmailException("wrong format for email");
                }

                System.out.print("enter phone:");
                phone = scanner.nextLine();
                employee.setPhone(phone);
                if (!PhoneRegex.isPhoneNumber(phone)) {
                    throw new PhoneException("wrong format for phone");
                }

                System.out.print("enter employee type:");
                employeeType = scanner.nextInt();
                scanner.nextLine();

                if (employeeType == 0) {
                    String idExperience;
                    String fullNameExperience;
                    String birthDayExperience;
                    String phoneExperience;
                    String emailExperience;
                    double expInYear;
                    String proSkill;

                    idExperience = id;
                    experience.setId(idExperience);

                    fullNameExperience = fullName;
                    experience.setFullName(fullNameExperience);

                    birthDayExperience = birthDay;
                    experience.setBirthDay(birthDayExperience);

                    phoneExperience = phone;
                    experience.setPhone(phoneExperience);

                    emailExperience = email;
                    experience.setEmail(emailExperience);


                    System.out.print("enter expInyear:");
                    expInYear = scanner.nextDouble();
                    scanner.nextLine();
                    experience.setExpInYear(expInYear);

                    System.out.print("enter proskill:");
                    proSkill = scanner.nextLine();
                    experience.setProSkill(proSkill);

                    employeeList.add(experience);
                    experienceList.add(experience);

                } else if (employeeType == 1) {
                    String idFresher;
                    String fullNameFresher;
                    String birthDayFresher;
                    String phoneFresher;
                    String emailFresher;
                    String graduationDate;
                    String graduationRank;
                    String education;

                    idFresher = id;
                    fresher.setId(idFresher);

                    fullNameFresher = fullName;
                    fresher.setFullName(fullNameFresher);

                    birthDayFresher = birthDay;
                    fresher.setBirthDay(birthDayFresher);

                    phoneFresher = phone;
                    fresher.setPhone(phoneFresher);

                    emailFresher = email;
                    fresher.setEmail(emailFresher);

                    System.out.print("graduation date:");
                    graduationDate = scanner.nextLine();
                    fresher.setGraduationDate(graduationDate);

                    System.out.print("graduation rank:");
                    graduationRank = scanner.nextLine();
                    fresher.setGraduationRank(graduationRank);

                    System.out.print("eduacation:");
                    education = scanner.nextLine();
                    fresher.setGraduationRank(education);

                    employeeList.add(fresher);
                    fresherList.add(fresher);

                } else if (employeeType == 2) {

                    String idIntern;
                    String fullNameIntern;
                    String birthDayIntern;
                    String phoneIntern;
                    String emailIntern;
                    String majors;
                    String semester;
                    String univercityName;

                    idIntern = id;
                    intern.setId(idIntern);

                    fullNameIntern = fullName;
                    intern.setFullName(fullNameIntern);

                    birthDayIntern = birthDay;
                    intern.setBirthDay(birthDayIntern);

                    phoneIntern = phone;
                    intern.setPhone(phoneIntern);

                    emailIntern = email;
                    intern.setEmail(emailIntern);

                    System.out.print("enter major");
                    majors = scanner.nextLine();
                    intern.setMajors(majors);

                    System.out.print("enter semester:");
                    semester = scanner.nextLine();
                    intern.setSemester(semester);

                    System.out.print("enter univercity name:");
                    univercityName = scanner.nextLine();
                    intern.setUnivercityName(univercityName);

                    employeeList.add(intern);
                    internList.add(intern);
                }
            } else if (select == 2) {
                String id;
                String fullName;
                System.out.print("enter id of employee you want to update:");
                id = scanner.nextLine();

                System.out.print("enter full name:");
                fullName = scanner.nextLine();

                Employee employee = employeeList.stream().filter(f -> f.getId().equals(id)).findFirst().get();
                employee.setFullNane(fullName);

            } else if (select == 3) {
                String id;
                System.out.print("enter id of employee you want to delete:");
                id = scanner.nextLine();

                employeeList.removeIf(f->f.getId().equals(id));

            } else if (select == 4) {
               internList.stream().forEach(System.out::println);
            } else if (select == 5) {
                experienceList.stream().forEach(System.out::println);
            } else if (select ==6) {
                fresherList.stream().forEach(System.out::println);
            }
        } while (select != 7);

    }
}
