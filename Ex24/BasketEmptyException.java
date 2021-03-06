package Ex24;

public class BasketEmptyException extends RuntimeException {

    public BasketEmptyException() {
        super();
    }

    public BasketEmptyException(String message) {
        super(message);
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
