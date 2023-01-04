package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCanBo {

    List<CanBo> canBoList = new ArrayList<>();

    public void addCanBo(CanBo canBo) {
        canBoList.add(canBo);
    }

    public void findFullName(String fullName) {
       List<CanBo> getCanBoFullName = canBoList.stream().filter(f -> f.getFullName().equals(fullName)).collect(Collectors.toList());
        System.out.println(getCanBoFullName);
    }

    public void showInforCanBo() {
         canBoList.stream().forEach(System.out::println);
    }


}
