package Ex13;

import java.util.ArrayList;

import Ex12.Car;
import Ex12.EngineType;

public class CarService {

    private ArrayList<Car> cars = new ArrayList<>();

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public ArrayList<Car> getAllCars() {
        return cars;
    }

    public ArrayList<Car> getV12Cars() {
        ArrayList<Car> v12Cars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {
                v12Cars.add(car);
            }
        }
        return v12Cars;
    }

    public ArrayList<Car> getCarsBefore1999() {
        ArrayList<Car> carsBefore1999 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture() < 1999) {
                carsBefore1999.add(car);
            }
        }
        return carsBefore1999;
    }

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

    public Car getCarsWithAtLeast3Manufacturers() {
        Car carWithAtLeast3Manufacturers = null;
        for (Car car : cars) {
            if (car.getManufacturerList().size() >= 3) {
                carWithAtLeast3Manufacturers = car;
            }
        }
        return carWithAtLeast3Manufacturers;
    }

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

    public ArrayList<Car> getCarsManufacturedBy(String manufacturer) {
        ArrayList<Car> carsManufacturedBy = new ArrayList<>();
        for (Car car : cars) {
            car.getManufacturerList().forEach((m) -> {
                if (m.getName().equals(manufacturer)) {
                    carsManufacturedBy.add(car);
                }
            });
        }
        return carsManufacturedBy;
    }

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