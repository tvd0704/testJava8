package bai3;

public class A extends Student{

  private final String toan = "TOAN";

  private final String ly = "LY";

  private final String hoa = "HOA";

    public A() {
    }

    public A(String soBaoDanh, String fullName, String address, int mucUuTien) {
        super(soBaoDanh, fullName, address, mucUuTien);
    }

    public String getToan() {
        return toan;
    }

    public String getLy() {
        return ly;
    }

    public String getHoa() {
        return hoa;
    }

    @Override
    public String toString() {
        return "A{" +
                toan + '\'' +
                ly + '\'' +
                hoa + '\'' +
                toString1() +
                '}';
    }
}
