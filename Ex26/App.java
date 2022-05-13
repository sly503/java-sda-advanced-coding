package Ex26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(new Manufacturer("BMW", 1919));
        manufacturers.add(new Manufacturer("Mercedes", 1910));
        manufacturers.add(new Manufacturer("Audi", 1930));
        manufacturers.add(new Manufacturer("Volkswagen", 1937));
        manufacturers.add(new Manufacturer("Ford", 1903));
        manufacturers.add(new Manufacturer("Toyota", 1937));
        manufacturers.add(new Manufacturer("Nissan", 1921));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 2000, CarType.SUV, manufacturers.get(0), "BMW X5"));
        cars.add(new Car("BMW", "X6", 2019, CarType.SUV, manufacturers.get(0), "BMW X6"));

        cars.add(new Car("Mercedes", "C-Class", 2010, CarType.SEDAN, manufacturers.get(1), "Mercedes C-Class"));
        cars.add(new Car("Mercedes", "E-Class", 2019, CarType.SEDAN, manufacturers.get(1), "Mercedes E-Class"));

        cars.add(new Car("Audi", "A4", 2019, CarType.SEDAN, manufacturers.get(2), "Audi A4"));
        cars.add(new Car("Audi", "A6", 1910, CarType.SEDAN, manufacturers.get(2), "Audi A6"));

        cars.add(new Car("Volkswagen", "Golf", 1900, CarType.HATCHBACK, manufacturers.get(3), "Volkswagen Golf"));
        cars.add(new Car("Volkswagen", "Passat", 2019, CarType.HATCHBACK, manufacturers.get(3), "Volkswagen Passat"));

        cars.add(new Car("Ford", "Fiesta", 2019, CarType.HATCHBACK, manufacturers.get(4), "Ford Fiesta"));
        cars.add(new Car("Ford", "Focus", 2000, CarType.HATCHBACK, manufacturers.get(4), "Ford Focus"));

        cars.add(new Car("Toyota", "Corolla", 2019, CarType.HATCHBACK, manufacturers.get(5), "Toyota Corolla"));
        cars.add(new Car("Toyota", "Auris", 2019, CarType.HATCHBACK, manufacturers.get(5), "Toyota Auris"));

        cars.add(new Car("Nissan", "Qashqai", 1800, CarType.HATCHBACK, manufacturers.get(6), "Nissan Qashqai"));
        cars.add(new Car("Nissan", "X-Trail", 2019, CarType.HATCHBACK, manufacturers.get(6), "Nissan X-Trail"));

        // a list of all Models disticnt
        List<String> models = cars.stream().map(Car::getModel).distinct().collect(Collectors.toList());
        System.out.println("a list of all Models disticnt " + models);

        // a list of all cars
        List<Car> cars1 = cars.stream().collect(Collectors.toList());
        System.out.println("a list of all cars " + cars1);

        // list of all manufacturer names
        List<String> manufacturerNames = manufacturers.stream().map(Manufacturer::getName).collect(Collectors.toList());
        System.out.println("list of all manufacturer names " + manufacturerNames);

        // list of all manufactureres year of foundation
        List<Integer> manufactureresYearOfFoundation = manufacturers.stream().map(Manufacturer::getYearOfFoundation)
                .collect(Collectors.toList());
        System.out.println("list of all manufactureres year of foundation " + manufactureresYearOfFoundation);

        // list of all model names
        List<String> modelNames = cars.stream().map(Car::getModel).collect(Collectors.toList());
        System.out.println("list of all model names " + modelNames);

        // list of all years of starting production of models discinct
        List<Integer> yearsOfStartingProductionOfModels = cars.stream().map(Car::getYearOfProduction).distinct()
                .collect(Collectors.toList());
        System.out.println(
                "list of all years of starting production of models discinct " + yearsOfStartingProductionOfModels);

        // list of all car names
        List<String> carNames = cars.stream().map(Car::getName).collect(Collectors.toList());
        System.out.println("list of all car names " + carNames);

        // list of all car descriptions
        List<String> carDescriptions = cars.stream().map(Car::getDescription).collect(Collectors.toList());
        System.out.println("list of all car descriptions " + carDescriptions);

        // only models with an even year of production start
        List<Car> cars2 = cars.stream().filter(car -> car.getYearOfProduction() % 2 == 0).collect(Collectors.toList());
        System.out.println("only models with an even year of production start " + cars2);

        // only cars from manufacturers with an even year of foundation
        List<Car> cars3 = cars.stream().filter(car -> car.getManufacturer().getYearOfFoundation() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("only cars from manufacturers with an even year of foundation " + cars3);

        // only cars with an even year of starting production of the model and an odd
        // year of establishing the manufacturer
        List<Car> cars4 = cars.stream().filter(
                car -> car.getYearOfProduction() % 2 == 0 && car.getManufacturer().getYearOfFoundation() % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(
                "only cars with an even year of starting production of the model and an odd year of establishing the "
                        + cars4);

        // only CABRIO cars with an odd year of starting model production and an even
        // year of establishing the manufacturer
        List<Car> cars5 = cars.stream().filter(car -> car.getModel().equals("CABRIO")
                && car.getYearOfProduction() % 2 == 1 && car.getManufacturer().getYearOfFoundation() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(
                "only CABRIO cars with an odd year of starting model production and an even year of establishing the "
                        + cars5);

        // only cars of the SEDAN type from a model newer than 2019 and the
        // manufacturer's founding year less than 1919
        List<Car> cars6 = cars.stream().filter(car -> car.getType().equals(CarType.SEDAN)
                && car.getYearOfProduction() > 2019 && car.getManufacturer().getYearOfFoundation() < 1919)
                .collect(Collectors.toList());
        System.out.println(
                "only cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than 1919 "
                        + cars6);

    }

}
