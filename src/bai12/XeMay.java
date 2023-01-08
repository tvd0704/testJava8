package bai12;

public class XeMay extends PhuongTienGiaoThong{

    private double congSuat;

    public XeMay() {

    }


    public XeMay(String id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, double congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat + toString1() +
                '}';
    }
}
