package Ex21;

public class Cone extends $3DShape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    //area of a cone is 3.14 times the radius times the side
    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    //given the perimeter of the base of a cone which is the same as the circumference of a circle, that is, C=2πr .
    // Then, we have to substitute this value in the formula of curved surface area which is πrl (C * sland Height) .
    @Override
    public double calculatePerimeter() {
        Double C = 2 * Math.PI * radius;
        return C * height;
    }

    @Override
    public String toString() {
        return "Cone{" + "radius=" + radius + ", height=" + height + '}';
    }

    
}
