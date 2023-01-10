package bai13;

public class Experience extends Employee {

    private double expInYear;
    private String proSkill;

    public Experience() {

    }

    public Experience(String id, String fullName, String birthDay, String email, String phone, int employeeType, double expInYear, String proSkill) {
        super(id, fullName, birthDay, email, phone, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear + toString1()+
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
