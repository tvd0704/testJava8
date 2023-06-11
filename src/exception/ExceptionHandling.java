package exception;

public class ExceptionHandling {
    public static void main(String[] args) {

        try{
            int myInt = Integer.parseInt("12");
        }catch (NumberFormatException nfe) {
            System.out.println("hey due, you can't make an int out");
        }

        System.out.println("end here");



    }
}
