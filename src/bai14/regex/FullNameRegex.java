package bai14.regex;

public class FullNameRegex {

    public static boolean isFullname(String fullName) {
        String expression = "^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$";
        return fullName.matches(expression);
    }
}
