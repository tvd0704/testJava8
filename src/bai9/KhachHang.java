package bai9;

public class KhachHang {

    private String fullName;
    private int soNha;
    private String maCongToDien;

    public KhachHang() {
    }

    public KhachHang(String fullName, int soNha, String maCongToDien) {
        this.fullName = fullName;
        this.soNha = soNha;
        this.maCongToDien = maCongToDien;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCongToDien() {
        return maCongToDien;
    }

    public void setMaCongToDien(String maCongToDien) {
        this.maCongToDien = maCongToDien;
    }


    @Override
    public String toString() {
        return "KhachHang{" +
                "fullName='" + fullName + '\'' +
                ", soNha=" + soNha +
                ", maCongToDien=" + maCongToDien +
                '}';
    }
}
