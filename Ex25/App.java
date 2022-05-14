package Ex25;

public class App {

    public static void main(String[] args) {

        Basket basket1 = new Basket();

        try {
            basket1.addToBasket();
        } catch (BasketFullException e) {
            e.printStackTrace();
        }

        try {
            basket1.removeFromBasket();
            basket1.removeFromBasket();
        } catch (BasketEmptyException e) {
            e.printStackTrace();
        }

    }

}
