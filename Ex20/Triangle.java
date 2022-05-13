package Ex20;


//A = 1/2 × b × h.
//P = a + b+ c.


public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }


    @Override
    public double calculateArea() {
        return (1.0 / 2) * sideA * sideB;
    }




}
