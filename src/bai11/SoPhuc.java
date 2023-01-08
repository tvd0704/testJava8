package bai11;

public class SoPhuc {

    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return "SoPhuc{" +
                "phanThuc=" + phanThuc +
                ", phanAo=" + phanAo +
                '}';
    }


    public void cong2SoPhuc(double phanThuc1, double phanAo1, double phanThuc2, double phanAo2) {
        System.out.println("ket qua sau khi cong 2 so phuc:" + (phanThuc1 + phanThuc2) + "+" + (phanAo1 + phanAo2) + "i");
    }

    public void nhan2SoPhuc(double phanThuc1, double phanAo1, double phanThuc2, double phanAo2) {

        double phanThuc3 = phanThuc1 * phanThuc2 - phanAo1 * phanAo2;
        double phanAo3 = phanThuc1 * phanAo2 + phanThuc2 * phanAo1;
        System.out.println("ket qua sau khi nhan 2 so phuc la:" + (phanThuc3) + "+" + phanAo3 + "i");

    }

}
