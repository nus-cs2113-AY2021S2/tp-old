package seedu.hdbuy.data.exception;

public class InvalidFilterException extends Exception {
    public InvalidFilterException() {
        super("is not a valid filter.");
    }
}
