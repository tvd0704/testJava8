package bai10;

public class VanBan {

    private String xauKyTu;

    public VanBan() {
    }

    public VanBan(String xauKyTu) {
        this.xauKyTu = xauKyTu;
    }

    public String getXauKyTu() {
        return xauKyTu;
    }

    public void setXauKyTu(String xauKyTu) {
        this.xauKyTu = xauKyTu;
    }



    public void demSoTuCuaVanBan () {
        int chCount=0;
        for(int i=0; i<xauKyTu.length(); i++) {
            chCount++;
        }
        System.out.println("so ky tu cua van ban la:" +chCount);
    }

    public void demSoTuA () {
        long demA = xauKyTu.chars().filter(c -> (c == 'a'||c == 'A')).count();
        System.out.println("so ky tu a va A cua van ban la:" +demA);

    }

    public void chuanHoaXauKyTu () {
        System.out.println("van ban sau khi duoc chuan hoa:");
        System.out.println( xauKyTu.trim().replaceAll("\\s{2,}", " "));
    }


}
