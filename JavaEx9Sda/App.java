package JavaEx9Sda;

import java.util.Arrays;
/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */


public class App {
    public static void main(String[] args) {
        
        Point2D p1 = new Point2D(1, 1);
        Point2D p2 = new Point2D(3, 5);
        Circle c1 = new Circle(p1, p2);
        System.out.println(c1.getRadius());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());

        //print getSlicePoints in Circle class
        System.out.println(Arrays.toString(c1.getSlicePoints().toArray()));

        //print using streams
        c1.getSlicePoints().forEach(System.out::println);
        
    }
}
