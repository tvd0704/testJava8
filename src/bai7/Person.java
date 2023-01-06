package bai7;

public class Person {

    private String fullName;
    private int age;
    private String homeTowl;
    private String id;

    public Person() {
    }

    public Person(String fullName , int age, String homeTowl, String id) {
        this.fullName = fullName;
        this.age = age;
        this.homeTowl = homeTowl;
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

    public String getHomeTowl() {
        return homeTowl;
    }

    public void setHomeTowl(String homeTowl) {
        this.homeTowl = homeTowl;
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
                ", age='" + age + '\'' +
                ", homeTowl='" + homeTowl + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
