package bai3;

public class C extends Student{

    private final String van = "VAN";
    private final String su = "SU";
    private final String dia = "DIA";

    public C() {
    }

    public C(String soBaoDanh, String fullName, String address, int mucUuTien) {
        super(soBaoDanh, fullName, address, mucUuTien);
    }

    public String getVan() {
        return van;
    }

    public String getSu() {
        return su;
    }

    public String getDia() {
        return dia;
    }

    @Override
    public String toString() {
        return "C{" +
                van + '\'' +
                su + '\'' +
                dia + '\'' +
                toString1() +
                '}';
    }
}
