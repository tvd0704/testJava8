package bai3;

public class B extends Student{

    private final String toan = "TOAN";
    private final String hoa = "HOA";
    private final String sinh = "SINH";

    public B() {
    }

    public B(String soBaoDanh, String fullName, String address, int mucUuTien) {
        super(soBaoDanh, fullName, address, mucUuTien);
    }

    public String getToan() {
        return toan;
    }

    public String getHoa() {
        return hoa;
    }

    public String getSinh() {
        return sinh;
    }

    @Override
    public String toString() {
        return "B{" +
                toan + '\'' +
                hoa + '\'' +
                sinh + '\'' +
                toString1() +
                '}';
    }
}
