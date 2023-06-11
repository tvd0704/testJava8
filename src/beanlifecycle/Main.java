package beanlifecycle;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Student, String> map = new HashMap<>();
        Student student = new Student("duc tran van");
        map.put(student, "tran van duc");

//        student.setName("123456");

        System.out.println(map.get(student));

    }
}
