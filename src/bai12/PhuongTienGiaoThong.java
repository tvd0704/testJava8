package bai12;

public class PhuongTienGiaoThong {

    private String id;
    private String hangSanXuat;
    private String namSanXuat;
    private double giaBan;
    private String mauXe;


    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe) {
        this.id = id;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }


    public String toString1() {
        return "PhuongTienGiaoThong{" +
                "id='" + id + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", giaBan=" + giaBan +
                ", mauXe=" + mauXe +
                '}';
    }
}
