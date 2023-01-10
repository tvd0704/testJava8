package bai13;

public class Employee {

    private String id;
    private String fullName;
    private String birthDay;

    private String email;
    private String phone;
    private int employeeType;

    private static int employeeCount =0;

    public Employee() {
        employeeCount++;

    }

    public Employee(String id, String fullName, String birthDay, String email, String phone, int employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;
        this.employeeType = employeeType;
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

    public void setFullNane(String fullNane) {
        this.fullName = fullNane;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString1() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullNane='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", employeeType=" + employeeType +
                '}';
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                "employeeCount="+employeeCount +
                ", employeeType=" + employeeType +
                '}';
    }
}
