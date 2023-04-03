package TestExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai1 {
    static String[] vowel = new String[]{"a", "e", "o", "i", "u", "y", "A", "E", "O", "I", "U", "Y"};


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();


        //enter name of number of student
        String name;
        int numberOfStudent;
        System.out.print("enter number of student in class:");
        numberOfStudent = scanner.nextInt();
        scanner.nextLine();

        // add student in List<Student>
        for (int i = 0; i < numberOfStudent; i++) {
            Student student = new Student();
            System.out.print("enter name of student " + (i + 1) + ": ");
            name = scanner.nextLine();
            student.setName(name);
            studentList.add(student);
        }

        // we have array input name of student
        List<String> studentName = studentList.stream().map(t -> t.getName()).collect(Collectors.toList());
        System.out.print("name of studets");
        System.out.println(studentName);

        //Caculate time equal the vowel
        List<Double> timeOfStudent = new ArrayList<>();
        for (int i = 0; i < numberOfStudent; i++) {
            double s = 5;
            char[] chars = studentName.get(i).toCharArray();
            int checked = 0;

            //caculate s
            for (int j = 0; j < chars.length; j++) {
                if (checked != 0 && j <= checked) {
                    continue;
                }
                String str = Character.toString(chars[j]);
                if (!((Arrays.asList(vowel).contains(str)))) {
                    int count = 0;
                    for (int k = j + 1; k < chars.length; k++) {
                        String str2 = Character.toString(chars[k]);
                        if (!((Arrays.asList(vowel).contains(str2)))) {
                            count++;
                            checked = k;
                        } else {
                            break;
                        }
                    }
                    s = s + Math.pow(2, count);
                }
            }
            timeOfStudent.add(s);
        }
        System.out.print("s of each student:");
        System.out.println(timeOfStudent);

        // sum time of student
        Double sumOfTime = timeOfStudent.stream().reduce(0.0, (a, b) -> a + b);
        System.out.print("sum of time of all student:");
        System.out.println(sumOfTime);

    }


}



