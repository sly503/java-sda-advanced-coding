package Ex15;

/*
Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA etc. constants.
Each vehicle has its own parameters, e.g. price, power, etc. Enum should contain boolean isPremium() and
boolean isRegular() methods. The isPremium() method should return the opposite result to the call of the
isRegular() method.
In addition, the boolean isFasterThan() method should be declared and implemented as part of the enum
class. This method should accept the Car type object and display information that the indicated vehicle is
faster or not than the vehicle provided in the argument. To do this, use the compareTo() method.
*/
public enum Car {
 
    FERRARI(10000,300), PORSCHE(20000,400), MERCEDES(30000,500), BMW(40000,600), OPEL(50000,700), FIAT(60000,800), TOYOTA(70000,900);
 
    private int price;
    private int power;

    Car(int price, int power) {
        this.price = price;
        this.power = power;
    }

    //is premium 
    public boolean isPremium() {
        return !isRegular();
    }

    //is regular
    public boolean isRegular() {
        switch (this) {
            case MERCEDES:
            case BMW:
            case OPEL:
            case FIAT:
                return true;
            default:
                return false;
        }
    }

    //is faster than using compare to
    public boolean isFasterThan(Car car){
        int result = this.compareTo(car);
        return result > 0;
    }


    }




    


}
