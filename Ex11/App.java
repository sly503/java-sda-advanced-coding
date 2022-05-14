package Ex11;

import Ex9.Circle;
import Ex9.Point2D;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(0, 0), new Point2D(1, 1));
        System.out.println(circle);
        circle.resize(1.5);
        System.out.println(circle);
        circle.resize(0.5);
        System.out.println(circle);
        circle.resize(10.0);
        System.out.println(circle);
        circle.resize(22.0);
        System.out.println(circle);

    }
}
