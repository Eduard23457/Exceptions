package exceptions;

public class WrongPasswordExceptions extends RuntimeException{

    public WrongPasswordExceptions(String message) {
        super(message);
    }
}
