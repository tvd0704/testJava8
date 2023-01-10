package test;

import bai3.A;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        String sPhoneNumber = "60523411111";
        //String sPhoneNumber = "605-88899991";
        //String sPhoneNumber = "605-888999A";

        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(sPhoneNumber);

        if (matcher.matches()) {
            System.out.println("Phone Number Valid");
        }
        else
        {
            System.out.println("Phone Number must be in the form XXX-XXXXXXX");
        }
    }
}
