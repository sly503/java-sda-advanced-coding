package Ex24;

public class BasketEmptyException extends Exception {

    public BasketEmptyException() {
        super();
    }

    public BasketEmptyException(String message) {
        super(message);
    }

    public BasketEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketEmptyException(Throwable cause) {
        super(cause);
    }

    protected BasketEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "BasketEmptyException{" + '}';
    }

    @Override
    public String getMessage() {
        return "The basket is empty";
    }


}
