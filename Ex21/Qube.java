package Ex21;

public class Qube extends $3DShape {

    private double length;

    public Qube(double length) {
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * length;
    }

    @Override
    public double calculateArea() {
        return 6 * length * length;
    }

    @Override
    public Double calculateVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "Qube{" + "length=" + length + '}';
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
