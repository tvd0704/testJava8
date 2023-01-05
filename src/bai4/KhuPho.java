package bai4;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {



    List<List<Person>> personlistList = new ArrayList<>();
    public void checkHoGiaDinh(List<Person> personList) {
        personlistList.add(personList);
    }

    public void showInforHoGiaDinh() {
        personlistList.stream().forEach(System.out::println);
    }


}
