package bai4;

public class Person {

    private String id;
    private String fullName;
    private int age;
    private String ngheNghiep;

    public Person() {
    }

    public Person(String id, String fullName, int age, String ngheNghiep) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.ngheNghiep = ngheNghiep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                '}';
    }
}
