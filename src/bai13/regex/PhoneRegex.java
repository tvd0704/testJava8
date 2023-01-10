package bai13.regex;

public class PhoneRegex {

    public static boolean isPhoneNumber(String phoneNumber) {
        String expression = "\\d{10}";
        return phoneNumber.matches(expression);
    }
}
