package bai8;

public class The {

    private String maPhieuMuon;
    private int ngayMuon;
    private int hanTra;
    private String soHieuSach;

    public The() {
    }

    public The(String maPhieuMuon, int ngayMuon, int hanTra, String soHieuSach) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return "The{" +
                "maPhieuMuon='" + maPhieuMuon + '\'' +
                ", ngayMuon=" + ngayMuon +
                ", hanTra=" + hanTra +
                ", soHieuSach='" + soHieuSach + '\'' +
                '}';
    }
}
