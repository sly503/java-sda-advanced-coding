package Ex13;

import java.util.ArrayList;

import Ex12.Car;
import Ex12.EngineType;

public class CarService {
    // Create a list of cars
    private ArrayList<Car> cars = new ArrayList<>();

    // remove
    public void removeCar(Car car) {
        cars.remove(car);
    }

    // add
    public void addCar(Car car) {
        cars.add(car);
    }

    // return list of all cars
    public ArrayList<Car> getAllCars() {
        return cars;
    }

    // return cars with a V12 engine
    public ArrayList<Car> getV12Cars() {
        ArrayList<Car> v12Cars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                v12Cars.add(car);
            }
        }
        return v12Cars;
    }

    // return cars produced before 1999
    public ArrayList<Car> getCarsBefore1999() {
        ArrayList<Car> carsBefore1999 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture() < 1999) {
                carsBefore1999.add(car);
            }
        }
        return carsBefore1999;
    }

    // return the most expensive car
    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : cars) {
            if (mostExpensiveCar == null) {
                mostExpensiveCar = car;
            } else {
                if (car.getPrice() > mostExpensiveCar.getPrice()) {
                    mostExpensiveCar = car;
                }
            }
        }
        return mostExpensiveCar;
    }

    // return the cheapest car
    public Car getCheapestCar() {
        Car cheapestCar = null;
        for (Car car : cars) {
            if (cheapestCar == null) {
                cheapestCar = car;
            } else {
                if (car.getPrice() < cheapestCar.getPrice()) {
                    cheapestCar = car;
                }
            }
        }
        return cheapestCar;
    }

    // return the car with at least 3 manufacturers
    public Car getCarsWithAtLeast3Manufacturers() {
        Car carWithAtLeast3Manufacturers = null;
        for (Car car : cars) {
            if (car.getManufacturerList().size() >= 3) {
                carWithAtLeast3Manufacturers = car;
            }
        }
        return carWithAtLeast3Manufacturers;
    }

    // return a list of all cars sorted ascending / descending
    public ArrayList<Car> getSortedCars(boolean ascending) {
        ArrayList<Car> sortedCars = new ArrayList<>();
        if (ascending) {
            for (int i = 0; i < cars.size(); i++) {
                for (int j = i + 1; j < cars.size(); j++) {
                    if (cars.get(i).getPrice() > cars.get(j).getPrice()) {
                        Car temp = cars.get(i);
                        cars.set(i, cars.get(j));
                        cars.set(j, temp);
                    }
                }
            }
        } else {
            for (int i = 0; i < cars.size(); i++) {
                for (int j = i + 1; j < cars.size(); j++) {
                    if (cars.get(i).getPrice() < cars.get(j).getPrice()) {
                        Car temp = cars.get(i);
                        cars.set(i, cars.get(j));
                        cars.set(j, temp);
                    }
                }
            }
        }
        sortedCars = cars;
        return sortedCars;
    }

    // check if a specific car is on the list
    public boolean isCarOnList(Car car) {
        for (Car c : cars) {
            if (c.equals(car)) {
                System.out.println("Car is on the list");
                return true;
            }
        }
        System.out.println("Car is not on the list");
        return false;
    }

    // return a list of cars manufactured by a specific manufacturer
    public ArrayList<Car> getCarsManufacturedBy(String manufacturer) {
        ArrayList<Car> carsManufacturedBy = new ArrayList<>();
        for (Car car : cars) {
            // for each manufacturer in the car with name manufacturer
            car.getManufacturerList().forEach((m) -> {
                if (m.getName().equals(manufacturer)) {
                    carsManufacturedBy.add(car);
                }
            });
        }
        return carsManufacturedBy;
    }

    // return the list of cars manufactured by the manufacturer with the year of
    // establishment <,>, <=,>=,=,! = from the given , int year and enum Operator
    // parameters .
    public ArrayList<Car> carsManufacturedByManufacturerWithYearOfEstablishment(int year, Operator operator) {
        ArrayList<Car> carsManufacturedBy = new ArrayList<>();
        switch (operator) {
            case LESS:
                for (Car car : cars) {
                    if (car.getManufacturerList().get(0).getYearOfEstablishment() < year) {
                        carsManufacturedBy.add(car);
                    }
                }
                break;
            case GREATER:
                for (Car car : cars) {
                    if (car.getManufacturerList().get(0).getYearOfEstablishment() > year) {
                        carsManufacturedBy.add(car);
                    }
                }
                break;
            case LESS_OR_EQUAL:
                for (Car car : cars) {
                    if (car.getManufacturerList().get(0).getYearOfEstablishment() <= year) {
                        carsManufacturedBy.add(car);
                    }
                }
                break;
            case GREATER_OR_EQUAL:
                for (Car car : cars) {
                    if (car.getManufacturerList().get(0).getYearOfEstablishment() >= year) {
                        carsManufacturedBy.add(car);
                    }
                }
                break;
            case EQUAL:
                for (Car car : cars) {
                    if (car.getManufacturerList().get(0).getYearOfEstablishment() == year) {
                        carsManufacturedBy.add(car);
                    }
                }
                break;
            case NOT_EQUAL:
                for (Car car : cars) {
                    if (car.getManufacturerList().get(0).getYearOfEstablishment() != year) {
                        carsManufacturedBy.add(car);
                    }
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        return carsManufacturedBy;

    }

}