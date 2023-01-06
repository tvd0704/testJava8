package bai6;

public class Student {

    private String fullName;
    private int age;
    private String homeTowl;

    public Student() {
    }

    public Student(String fullName, int age, String homeTowl) {
        this.fullName = fullName;
        this.age = age;
        this.homeTowl = homeTowl;
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

    public String getHomeTowl() {
        return homeTowl;
    }

    public void setHomeTowl(String homeTowl) {
        this.homeTowl = homeTowl;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", homeTowl='" + homeTowl + '\'' +
                '}';
    }
}
