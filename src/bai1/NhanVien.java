package bai1;

public class NhanVien extends CanBo {
    private String work;

    public NhanVien() {
    }


    public NhanVien(String fullName, int age, String sex, String address, String work) {
        super(fullName, age, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "work='" + work + '\'' + toString1() +
                '}';
    }
}
