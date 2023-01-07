package bai9;

import java.util.List;

public class BienLai {

    private KhachHang khachHang;

    private int chiSoDienMoi;

    private int chiSoDienCu;

    private int soTienPhaiTra;


    public BienLai() {
    }

    public BienLai(KhachHang khachHang, int chiSoDienMoi, int chiSoDienCu, int soTienPhaiTra) {
        this.khachHang = khachHang;
        this.chiSoDienMoi = chiSoDienMoi;
        this.chiSoDienCu = chiSoDienCu;
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public void setChiSoDienMoi(int chiSoDienMoi) {
        this.chiSoDienMoi = chiSoDienMoi;
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(int chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public int getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(int soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "khachHang=" + khachHang +
                ", chiSoDienMoi=" + chiSoDienMoi +
                ", chiSoDienCu=" + chiSoDienCu +
                ", soTienPhaiTra=" + soTienPhaiTra +
                '}';
    }
}
