package test;

import java.time.LocalDate;
import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        System.out.println(month);
    }
}
