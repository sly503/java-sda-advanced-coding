package Ex21;

public class Cone extends $3DShape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public Double calculateVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    // area of a cone is 3.14 times the radius times the side
    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    public double calculatePerimeter() {
        Double C = 2 * Math.PI * radius;
        return C * height;
    }

    @Override
    public String toString() {
        return "Cone{" + "radius=" + radius + ", height=" + height + '}';
    }

    @Override
    public void fill(Double capacity) {

        if (capacity > calculateVolume()) {
            System.out.println("The figure is overflowing");
        } else if (capacity < calculateVolume()) {
            System.out.println("The figure is not filling enough");
        } else {
            System.out.println("The figure is filled");
        }

    }

}
