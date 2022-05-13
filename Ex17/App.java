package Ex17;

public class App {

    public static void main(String[] args) {
        //convert to yards

        double meters = 10;
        double yards = MeasurementConverter.convert(meters, ConversionType.METERS_TO_YARDS);
        System.out.println(yards);

        //convert to meters
        double yards2 = 20;
        double meters2 = MeasurementConverter.convert(yards2, ConversionType.YARDS_TO_METERS);
        System.out.println(meters2);

        //convert to inches
        double centimeters = 30;
        double inches = MeasurementConverter.convert(centimeters, ConversionType.CENTIMETERS_TO_ICHES);
        System.out.println(inches);

        //convert to centimeters
        double inches2 = 40;
        double centimeters2 = MeasurementConverter.convert(inches2, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(centimeters2);


    }
    
}
