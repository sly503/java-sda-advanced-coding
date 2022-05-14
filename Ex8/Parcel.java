package Ex8;

public class Parcel implements Validator {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = false;

    }

    @Override
    public boolean validate(Parcel input) {
        if (input.xLength + input.yLength + input.zLength > 300) {
            System.out.println("The sum of the dimensions is too large");

        } else if (input.xLength < 30 || input.yLength < 30 || input.zLength < 30) {
            System.out.println("One of the dimensions is too small");

        } else if (input.isExpress) {
            if (input.weight > 15.0) {
                System.out.println("The weight is too large");
            } else {
                isExpress = true;
                System.out.println("The parcel is valid");
                return isExpress;
            }
        } else {
            if (input.weight > 30.0) {
                System.out.println("The weight is too large");
            } else {
                isExpress = true;
                System.out.println("The parcel is valid");
                return isExpress;
            }
        }
        System.out.println("The parcel is not valid");
        return isExpress;
    }

}
