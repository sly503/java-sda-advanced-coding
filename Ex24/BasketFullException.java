package Ex24;

public class BasketFullException extends Exception {

    public BasketFullException() {
        super();
    }

    public BasketFullException(String message) {
        super(message);
    }

    public BasketFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketFullException(Throwable cause) {
        super(cause);
    }

    protected BasketFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "BasketFullException{" + '}';
    }

    @Override
    public String getMessage() {
        return "The basket is full";
    }

}
