package Ex25;

public class BasketFullException extends Exception{

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
