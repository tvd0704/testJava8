package bai6;

import java.util.List;

public class School {

    private String lop;

    private Student student;


    public School() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void findStudent(List<Student> studentList) {
        studentList.stream().filter(f -> f.getAge() >= 20).forEach(System.out::println);
        String lop = getLop();
        System.out.println(lop);

    }

    @Override
    public String toString() {
        return "School{" +
                "lop='" + lop + '\'' +
                ", student=" + student +
                '}';
    }
}
