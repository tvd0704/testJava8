package bai13.exception;

public class FullNameException extends Exception{


    public FullNameException() {
    }

    public FullNameException(Throwable cause) {
        super(cause);
    }

    public FullNameException(String message) {
        super(message);
    }
}
