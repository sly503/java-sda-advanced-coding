package Ex15;

public class App {
    
    public static void main(String[] args) {
        
        Car car = Car.MERCEDES;
        System.out.println(car.isPremium());
        System.out.println(car.isRegular());
        System.out.println(car.isFasterThan(Car.TOYOTA));
        
    }
    
}