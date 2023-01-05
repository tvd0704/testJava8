package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuanLyStudent {

    public List<Student> studentList = new ArrayList<>();


    public void addStudent (Student student) {
        studentList.add(student);
    }

    public void showInforStudent () {
        studentList.stream().forEach(System.out::println);
    }

    public void findStudentById (String id) {
        Optional<Student> studentOptional = studentList.stream().filter(f -> f.getSoBaoDanh().equals(id))
                .findFirst();
        if(studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }
        else {
            System.out.println("no student by id:" + id);
        }
    }



}
