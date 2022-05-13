package Ex13;

import java.util.List;

import Ex12.Car;
import Ex12.EngineType;
import Ex12.Manufacturer;

public class App {

    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer BMW = new Manufacturer("BMW", 1999, "Germany");
        Manufacturer Audi = new Manufacturer("Audi", 1998, "Germany");
        Manufacturer Mercedes = new Manufacturer("Mercedes", 2000, "Germany");
        Manufacturer Volkswagen = new Manufacturer("Volkswagen", 1999, "Germany");

        Car car1 = new Car("BMW", "X5", 20000.0, 1990, List.of(BMW, Audi), EngineType.V12);
        Car car2 = new Car("Mercedes", "X6", 30000.0, 1999, List.of(Mercedes, Volkswagen), EngineType.V12);
        Car car3 = new Car("BMW", "X7", 40000.0, 1999, List.of(BMW, Volkswagen), EngineType.V12);
        Car car4 = new Car("Audi", "X8", 50000.0, 2017, List.of(Audi, Volkswagen), EngineType.V12);
        Car car5 = new Car("BMW", "X9", 60000.0, 2005, List.of(BMW, Volkswagen), EngineType.V12);
        Car car6 = new Car("Mercedes", "X10", 70000.0, 2000, List.of(Mercedes, Volkswagen, Audi), EngineType.V12);

        List<Car> cars = List.of(car1, car2, car3, car4, car5, car6);
        cars.stream().forEach(carService::addCar);

        // remove
        carService.removeCar(car1);

        // add
        carService.addCar(car1);

        // return list of all cars
        List<Car> allCars = carService.getAllCars();
        allCars.stream().forEach(System.out::println);

        // return cars with a V12 engine
        List<Car> v12Cars = carService.getV12Cars();
        v12Cars.stream().forEach(System.out::println);

        // return cars produced before 1999
        List<Car> carsBefore1999 = carService.getCarsBefore1999();
        carsBefore1999.stream().forEach(System.out::println);

        // return the most expensive car
        Car mostExpensiveCar = carService.getMostExpensiveCar();
        System.out.println(mostExpensiveCar);

        // return the cheapest car
        Car cheapestCar = carService.getCheapestCar();
        System.out.println(cheapestCar);

        // return the car with at least 3 manufacturers
        Car carWith3Manufacturers = carService.getCarsWithAtLeast3Manufacturers();
        System.out.println(carWith3Manufacturers);

        // return a list of cars manufactured by a specific manufacturer
        List<Car> carsByManufacturer = carService.getCarsManufacturedBy("BMW");
        System.out.println(carsByManufacturer);

        // getCarsManufacturedByManufacturerWithYearOfEstablishment
        List<Car> results = carService.carsManufacturedByManufacturerWithYearOfEstablishment(1999, Operator.EQUAL);
        results.stream().forEach(System.out::println);

    }

}
