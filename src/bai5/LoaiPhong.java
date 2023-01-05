package bai5;

public enum LoaiPhong {
    A(500),B(300),C(100);
    LoaiPhong(int price) {
        this.price = price;
    }
    private final int price;

    public int getPrice() {
        return price;
    }
}
