package Ex20;

public class App {
    public static void main(String[] args) {

        Hexagon hexagon1 = new Hexagon(3);

        System.out.println(hexagon1.calculatePerimeter());
        System.out.println(hexagon1.calculateArea());

        Rectangle rectangle1 = new Rectangle(3, 3);

        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle1.calculateArea());

        Triangle triangle1 = new Triangle(5, 5, 5);

        System.out.println(triangle1.calculatePerimeter());
        System.out.println(triangle1.calculateArea());

    }

}
