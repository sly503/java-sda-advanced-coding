package Ex23;

import java.net.Socket;

public class App {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimals("Cat", 2);
        zoo.addAnimals("Dog", 5);
        zoo.addAnimals("Cat", 1);

        System.out.println(zoo.getNumberOfAllAnimals());
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getAnimalsCountSorted());

    }

}
