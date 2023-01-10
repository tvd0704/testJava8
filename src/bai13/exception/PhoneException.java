package bai13.exception;

public class PhoneException extends Exception{
    public PhoneException() {
    }

    public PhoneException(Throwable cause) {
        super(cause);
    }

    public PhoneException(String message) {
        super(message);
    }

    public PhoneException(String message, Throwable cause) {
        super(message, cause);
    }
}
