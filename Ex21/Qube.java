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
    public double calculateVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "Qube{" + "length=" + length + '}';
    }
    
    
}
