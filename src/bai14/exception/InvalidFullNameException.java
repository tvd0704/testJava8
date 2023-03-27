package bai14.exception;

public class InvalidFullNameException extends Exception{
    public InvalidFullNameException() {
    }

    public InvalidFullNameException(Throwable cause) {
        super(cause);
    }

    public InvalidFullNameException(String message) {
        super(message);
    }

    public InvalidFullNameException(String message, Throwable cause) {
        super(message, cause);
    }

}
