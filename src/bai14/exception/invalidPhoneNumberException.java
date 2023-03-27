package bai14.exception;

public class invalidPhoneNumberException extends Exception{

    public invalidPhoneNumberException() {
    }

    public invalidPhoneNumberException(String message) {
        super(message);
    }

    public invalidPhoneNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidPhoneNumberException(Throwable cause) {
        super(cause);
    }

}
