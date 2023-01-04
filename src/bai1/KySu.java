package bai1;

public class KySu extends CanBo {
    private String major;

    public KySu() {
    }

    public KySu(String fullName, int age, String sex, String address) {
        super(fullName, age, sex, address);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "major='" + major + '\'' + toString1() +
                '}';
    }
}
