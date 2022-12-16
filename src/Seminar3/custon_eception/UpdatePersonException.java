package Seminar3.custon_eception;

public class UpdatePersonException extends Exception {
    public UpdatePersonException(String message) {
        super(message);
    }

    public UpdatePersonException(String message, Throwable cause) {
        super(message, cause);
    }
}