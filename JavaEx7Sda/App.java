package JavaEx7Sda;

/*
 * Exercise 7.
 * Create a class imitating a weapon magazine. The class should be able to
 * define the size of the magazine
 * using the constructor. Implement the methods:
 * loadBullet(String bullet) → adding a cartridge to the magazine, does not
 * allow loading more cartridges
 * than the capacity of the magazine
 * isLoaded() → returns information about whether the weapon is loaded (at least
 * one cartridge) or not
 * shot() → each call shots one bullet (prints string value in console) - the
 * last loaded cartridge - and
 * prepares the next one, loaded before the last one, if there are no more
 * cartridges, it prints "empty
 * magazine" in the console
 */

public class App {
    public static void main(String[] args) {
        Magazine magazine = new Magazine(10);

        // loadBullet(String bullet) → adding a cartridge to the magazine, does not
        // allow loading more cartridges
        magazine.loadBullet("bullet1");
        magazine.loadBullet("bullet2");
        magazine.loadBullet("bullet3");

        // isLoaded() → returns information about whether the weapon is loaded (at least
        // one cartridge) or not
        System.out.println(magazine.isLoaded());

        // shot() → each call shots one bullet (prints string value in console) - the
        // last loaded cartridge - and
        // prepares the next one, loaded before the last one, if there are no more
        // cartridges, it prints "empty
        // magazine" in the console
        magazine.shot();
        magazine.shot();
        magazine.shot();

        // isLoaded() → returns information about whether the weapon is loaded (at least
        // one cartridge) or not
        System.out.println(magazine.isLoaded());

    }
}
