package bai7;

public class CBNV {

    private float luongCung;
    private float luongThuong;
    private float tienPhat;
    private float luongThucLinh;
    private Person person;

    public CBNV() {
    }

    public CBNV(float luongCung, float luongThuong, float tienPhat, float luongThucLinh, Person person) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.luongThucLinh = luongThucLinh;
        this.person = person;
    }

    public float getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(float luongCung) {
        this.luongCung = luongCung;
    }

    public float getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(float luongThuong) {
        this.luongThuong = luongThuong;
    }

    public float getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(float tienPhat) {
        this.tienPhat = tienPhat;
    }

    public float getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(float luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "CBNV{" +
                "luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                ", tienPhat=" + tienPhat +
                ", luongThucLinh=" + luongThucLinh +
                ", person=" + person +
                '}';
    }
}
