package Seminar3.custon_eception;

public class ChangePermissionException extends Exception {
    public ChangePermissionException(String message) {
        super(message);
    }

    public ChangePermissionException(String message, Throwable cause) {
        super(message, cause);
    }
}
