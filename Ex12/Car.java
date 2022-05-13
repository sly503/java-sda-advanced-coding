package Ex12;

import java.util.List;

/*
 * Create a Car class that will contain fields: name, model, price, year of
 * manufacture, manufacturer list
 * (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8,
 * V6, S6, S4, S3). Include all
 * necessary methods and constructor parameters. Implement the hashcode() and
 * equals() methods.
 */

public class Car {
    private List<Manufacturer> manufacturerList;
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacture, List<Manufacturer> manufacturerList,
            EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Car car = (Car) o;

        if (Double.compare(car.price, price) != 0)
            return false;
        if (yearOfManufacture != car.yearOfManufacture)
            return false;
        if (name != null ? !name.equals(car.name) : car.name != null)
            return false;
        if (model != null ? !model.equals(car.model) : car.model != null)
            return false;
        return manufacturerList != null ? manufacturerList.equals(car.manufacturerList) : car.manufacturerList == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + yearOfManufacture;
        result = 31 * result + (manufacturerList != null ? manufacturerList.hashCode() : 0);
        return result;
    }

    public void add(Car car) {
    }

}
