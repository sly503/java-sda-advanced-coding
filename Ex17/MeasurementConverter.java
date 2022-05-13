package Ex17;


public class MeasurementConverter {
    
    public static double convert(Double value, ConversionType conversionType) {
        switch (conversionType) {
            case METERS_TO_YARDS:
                return value * 1.09361;
            case YARDS_TO_METERS:
                return value * 0.9144;
            case CENTIMETERS_TO_ICHES:
                return value * 0.393701;
            case INCHES_TO_CENTIMETERS:
                return value * 2.54;
            case KILOMETERS_TO_MILES:
                return value * 0.62137;
            case MILES_TO_KILOMETERS:
                return value * 1.60934;
            default:
                return value;
        }
    }
    


}
