package bai1;

public class CongNhan extends CanBo {

    private int level;

    public CongNhan() {
    }

    public CongNhan(String fullName, int age, String sex, String address) {
        super(fullName, age, sex, address);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "level=" + level + toString1() +
                '}';
    }
}
