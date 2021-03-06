package Ex24;

public class BasketFullException extends RuntimeException {

    public BasketFullException() {
        super();
    }

    public BasketFullException(String message) {
        super(message);
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
