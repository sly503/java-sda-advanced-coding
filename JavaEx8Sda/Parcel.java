package JavaEx8Sda;
/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */

/*
Implement the Validator interface, which will include a boolean validate(Parcel input) method in its
declaration. Create a Parcel class with the parameters:
• int xLength
• int yLength
• int zLength
• float weight
• boolean isExpress
The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In
case of errors, it should inform the user about them.
*/

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
