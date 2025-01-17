package exceptions;

public class TaskException extends Exception {
    public TaskException(String message) {
        super(message);
    }
    public TaskException(String message,TaskException exception) {
        super(message,exception);
    }
}
