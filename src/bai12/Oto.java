package bai12;

public class Oto extends PhuongTienGiaoThong {

    private int soSoNgoi;
    private String kieuDongCo;

    public Oto() {
    }

    public Oto(int soSoNgoi, String kieuDongCo) {
        this.soSoNgoi = soSoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public Oto(String id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, int soSoNgoi, String kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.soSoNgoi = soSoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoSoNgoi() {
        return soSoNgoi;
    }

    public void setSoSoNgoi(int soSoNgoi) {
        this.soSoNgoi = soSoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soSoNgoi=" + soSoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' + toString1() +
                '}';
    }
}
