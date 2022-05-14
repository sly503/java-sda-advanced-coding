package Ex9;

import java.util.ArrayList;
import java.util.List;
import Ex10.Movable;
import Ex10.MoveDirection;
import Ex11.Resizable;

public class Circle implements Movable, Resizable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

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

    /*
     * Exercise 10:
     * When the move(MoveDirection moveDirection) method is called,
     * the objects are to change their position based on the provided direction
     * (MoveDirection).
     */
    @Override
    public void move(MoveDirection moveDirection) {
        this.point.setX(this.point.getX() + moveDirection.getX());
        this.point.setY(this.point.getY() + moveDirection.getY());
        this.center.setX(this.center.getX() + moveDirection.getX());
        this.center.setY(this.center.getY() + moveDirection.getY());
    }

    // Exercise 11:
    // resize the circle by the given factor when calling the resize method
    @Override
    public void resize(double resizeFactor) {
        this.point.setX(this.point.getX() * resizeFactor);
        this.point.setY(this.point.getY() * resizeFactor);
        this.center.setX(this.center.getX() * resizeFactor);
        this.center.setY(this.center.getY() * resizeFactor);
    }

    // toString
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }

}
