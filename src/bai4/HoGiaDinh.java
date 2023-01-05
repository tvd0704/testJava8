package bai4;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh extends Person {

   private List<Person> personList = new ArrayList<>();

   public HoGiaDinh() {
   }

   public List<Person> getPersonList() {
      return personList;
   }

   public void setPersonList(List<Person> personList) {
      this.personList = personList;
   }

}
