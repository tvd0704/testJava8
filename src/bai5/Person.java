package bai5;

public class Person {
    private String fullName;
    private int age;
    private String id;

    public Person() {
    }

    public Person(String fullName, int age, String id) {
        this.fullName = fullName;
        this.age = age;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
