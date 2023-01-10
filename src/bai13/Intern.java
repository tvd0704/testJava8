package bai13;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String univercityName;

    public Intern() {
    }

    public Intern(String id, String fullName, String birthDay, String email, String phone, int employeeType, String majors, String semester, String univercityName) {
        super(id, fullName, birthDay, email, phone, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.univercityName = univercityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUnivercityName() {
        return univercityName;
    }

    public void setUnivercityName(String univercityName) {
        this.univercityName = univercityName;
    }


    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' + toString1() +
                ", semester='" + semester + '\'' +
                ", univercityName='" + univercityName + '\'' +
                '}';
    }
}
