package bai3;

public class Student {

    private String soBaoDanh;
    private String fullName;
    private String address;
    private int mucUuTien;

    public Student() {
    }

    public Student(String soBaoDanh, String fullName, String address, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.fullName = fullName;
        this.address = address;
        this.mucUuTien = mucUuTien;
    }


    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }


    public String toString1() {
        return "Student{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
