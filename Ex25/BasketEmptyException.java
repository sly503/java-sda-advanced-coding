package Ex25;
// to checked exception type
public class BasketEmptyException extends Exception {
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
