package bai13.regex;

public class EmailRegex {
    public static boolean isEmailRegex(String email) {
        String expression = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(expression);
    }
}
