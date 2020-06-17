package by.tsikunov.day3.exception;

public class ProgramException extends Exception {
    public ProgramException(String message) {
        super(message);
    }

    public ProgramException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProgramException(Throwable cause) {
        super(cause);
    }

    public ProgramException() {
    }
}
