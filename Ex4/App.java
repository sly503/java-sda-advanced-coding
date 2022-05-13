package Ex4;

public class App {
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("A", "1");
        storage.addToStorage("A", "2");
        storage.addToStorage("C", "3");
        storage.addToStorage("d", "2");
        storage.printValues("A");
        storage.findValues("3");

    }
}
