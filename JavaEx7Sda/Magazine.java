package JavaEx7Sda;

public class Magazine {

    private int capacity;
    private int bullets;

    public Magazine(int i) {
        this.capacity = i;
        this.bullets = 0;

    }

    public void loadBullet(String bullet) {
        if (bullets < capacity) {
            bullets++;
        } else {
            System.out.println("Magazine is full");
        }

    }

    public boolean isLoaded() {
        if (bullets > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void shot() {
        if (isLoaded()) {
            System.out.println("Bang!");
            bullets--;
        } else {
            System.out.println("Empty magazine");
        }
    }

}
