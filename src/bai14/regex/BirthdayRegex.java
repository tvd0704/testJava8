package bai14.regex;

public class BirthdayRegex {

    public static boolean isBirthDayRegex(String birthday) {
        String expression = "^\\d{4}-\\d{2}-\\d{2}$";
        return birthday.matches(expression);
    }

}
