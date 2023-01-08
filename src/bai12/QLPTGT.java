package bai12;

import java.util.ArrayList;
import java.util.List;

public class QLPTGT {

    private Oto oto;
    private XeMay xeMay;
    private XeTai xeTai;


    public QLPTGT() {
    }

    public Oto getOto() {
        return oto;
    }

    public void setOto(Oto oto) {
        this.oto = oto;
    }

    public XeMay getXeMay() {
        return xeMay;
    }

    public void setXeMay(XeMay xeMay) {
        this.xeMay = xeMay;
    }

    public XeTai getXeTai() {
        return xeTai;
    }

    public void setXeTai(XeTai xeTai) {
        this.xeTai = xeTai;
    }

    @Override
    public String toString() {
        return "QLPTGT{" +
                "oto=" + oto +
                ", xeMay=" + xeMay +
                ", xeTai=" + xeTai +
                '}';
    }
}
