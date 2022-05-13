package Ex25;

public class Basket {

    private int maxSize = 10;
    private int currentState;

    public Basket() {
        this.currentState = 0;
    }

    public void addToBasket() throws BasketFullException {
        if (this.currentState == this.maxSize) {
            throw new BasketFullException();
        } else {
            this.currentState++;
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (this.currentState == 0) {
            throw new BasketEmptyException();
        } else {
            this.currentState--;
        }
    }

    public int getCurrentState() {
        return this.currentState;
    }

    
}
