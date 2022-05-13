package Ex19;

import Ex18.Computer;

//Create a Laptop class extending the Computer class from the previous task. The Laptop class should
//additionally contain the battery parameter.
//Implement additional getters, setters, constructor and overwrite the toString(), equals() and hashcode()
//methods accordingly.
//Use a reference to parent class methods
public class Laptop extends Computer{

    private int battery;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, int battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" + "battery=" + battery + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.battery != other.battery) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.battery;
        return hash;
    }
    
}
