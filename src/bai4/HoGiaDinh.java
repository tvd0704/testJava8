package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

   public void checkForDuplicateId (String id) {
      Optional<Person> personOptional = personList.stream().filter(f ->f.getId().equals(id)).findFirst();
      if(personOptional.isPresent()) {
         throw new IllegalArgumentException("person " + id + " da ton tai");
      }

   }

}
