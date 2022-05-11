package JavaEx9Sda;
/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */

import java.util.ArrayList;
import java.util.List;

// create a Circle class that will have a constructor Circle(Point2D center, Point2D point)
public class Circle {
    
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    //circle radius when calling double getRadius() method

    public double getRadius() {
        return Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    //circle circumference when calling double getPerimeter() method

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    //circle area when calling double getArea() method

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    //(challenging) three points on the circle every 90 degrees from the point given when calling the list<Point2D> getSlicePoints() method

    //create a list of points on the circle
    //The formula for sector area is simple - multiply the central angle by the radius squared, and divide by 2: Sector Area = r² * α / 2.


    public List<Point2D> getSlicePoints() {
        List<Point2D> list = new ArrayList<>();
        double angle = 0;
        while (angle < 2 * Math.PI) {
            list.add(new Point2D(center.getX() + getRadius() * Math.cos(angle), center.getY() + getRadius() * Math.sin(angle)));
            angle += Math.PI / 2;
        }
        return list;            
}

    //toString
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }


}
