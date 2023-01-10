package bai13.exception;

public class BirthDayException extends Exception{

    public BirthDayException() {
    }

    public BirthDayException(String message) {
        super(message);
    }

    public BirthDayException(Throwable cause) {
        super(cause);
    }

    public BirthDayException(String message, Throwable cause) {
        super(message, cause);
    }
}
