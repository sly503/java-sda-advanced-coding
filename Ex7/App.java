package Ex7;

public class App {
    public static void main(String[] args) {
        Magazine magazine = new Magazine(10);

        magazine.loadBullet("bullet1");
        magazine.loadBullet("bullet2");
        magazine.loadBullet("bullet3");

        System.out.println(magazine.isLoaded());

        magazine.shot();
        magazine.shot();
        magazine.shot();

        System.out.println(magazine.isLoaded());

    }
}
