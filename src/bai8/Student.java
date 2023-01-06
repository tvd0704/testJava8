package bai8;

public class Student {

    private String fullName;
    private int age;
    private String lop;


    public Student() {
    }

    public Student(String fullName, int age, String lop) {
        this.fullName = fullName;
        this.age = age;
        this.lop = lop;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", lop='" + lop + '\'' +
                '}';
    }
}
