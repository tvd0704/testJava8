package bai9;

public class QuanLy {

    private BienLai bienLai;


    public QuanLy() {
    }

    public QuanLy(BienLai bienLai) {
        this.bienLai = bienLai;
    }

    public BienLai getBienLai() {
        return bienLai;
    }

    public void setBienLai(BienLai bienLai) {
        this.bienLai = bienLai;
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "bienLai=" + bienLai +
                '}';
    }
}
