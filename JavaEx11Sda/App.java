package JavaEx11Sda;

import JavaEx9Sda.Circle;
import JavaEx9Sda.Point2D;

/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */

/*
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle). When
 * calling the resize(double
 * resizeFactor) method, the circle should change its size by a given factor
 * (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */

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
