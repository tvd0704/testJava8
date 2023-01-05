package bai5;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Hotel {

    private int soNgayThue;
    private LoaiPhong loaiPhong;

    private List<Person> personList;

    public Hotel() {
    }


    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


    public void deletePerson(String id) {
        personList.removeIf(f -> f.getId().equals(id));
    }

    public void tinhTien(String id) {
        Optional<Person> personOptional = personList.stream().filter(f -> f.getId().equals(id)).findAny();
        int price;

        if (personOptional.isPresent()) {
            price = getLoaiPhong().getPrice() * getSoNgayThue();
            System.out.println(price);
        }

    }


    @Override
    public String toString() {
        return "Hotel{" +
                "soNgayThue=" + getSoNgayThue() +
                ", loaiPhong=" + loaiPhong.getPrice() +
                ", personList=" + getPersonList() +
                '}';
    }


}
