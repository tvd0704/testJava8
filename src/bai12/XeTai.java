package bai12;

public class XeTai extends  PhuongTienGiaoThong{

    private double trongTai;

    public XeTai() {
    }

    public XeTai(String id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, double trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                '}';
    }



}
