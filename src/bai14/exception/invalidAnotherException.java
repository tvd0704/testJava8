package bai14.exception;

public class invalidAnotherException extends Exception{
    public invalidAnotherException() {
    }

    public invalidAnotherException(String message) {
        super(message);
    }

    public invalidAnotherException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidAnotherException(Throwable cause) {
        super(cause);
    }

}
