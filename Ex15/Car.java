package Ex15;


// need to implement a compareTo method in another class ..
public enum Car {

    FERRARI(10000, 300), PORSCHE(20000, 400), MERCEDES(30000, 500), BMW(40000, 600), OPEL(50000, 700), FIAT(60000, 800),
    TOYOTA(70000, 900);

    private int price;
    private int power;

    Car(int price, int power) {
        this.price = price;
        this.power = power;
    }

    // is premium
    public boolean isPremium() {
        return !isRegular();
    }

    // is regular
    public boolean isRegular() {
        switch (this) {
            case MERCEDES:
            case BMW:
            case OPEL:
            case FIAT:
                return true;
            default:
                return false;
        }

    }

    public boolean isFasterThan(Car other) {
        return this.power > other.power;
    }

}