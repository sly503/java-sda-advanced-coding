package JavaEx9Sda;

/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */

import java.util.ArrayList;
import java.util.List;
import JavaEx10Sda.Movable;
import JavaEx10Sda.MoveDirection;

// create a Circle class that will have a constructor Circle(Point2D center, Point2D point)
/*Exercise 10:
Implement the interface in the classes from the previous task (Point2D and Circle). When the
move(MoveDirection moveDirection) method is called, the objects are to change their position based on
the provided direction (MoveDirection).
*/

public class Circle implements Movable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    // circle radius when calling double getRadius() method

    public double getRadius() {
        return Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    // circle circumference when calling double getPerimeter() method

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    // circle area when calling double getArea() method

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    // (challenging) three points on the circle every 90 degrees from the point
    // given when calling the list<Point2D> getSlicePoints() method
    
    public List<Point2D> getSlicePoints() {
        List<Point2D> points = new ArrayList<>();
        double angle = Math.PI / 2;
        double radius = getRadius();
        for (int i = 0; i < 3; i++) {
            points.add(new Point2D(center.getX() + radius * Math.cos(angle), center.getY() + radius * Math.sin(angle)));
            angle += Math.PI / 2;
        }
        return points;
    }

    // toString
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.point.setX(this.point.getX() + moveDirection.getX());
        this.point.setY(this.point.getY() + moveDirection.getY());
        this.center.setX(this.center.getX() + moveDirection.getX());
        this.center.setY(this.center.getY() + moveDirection.getY());
    }

}
