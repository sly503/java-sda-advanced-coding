package JavaEx8Sda;
/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */


public class App {
    public static void main(String[] args) {
        Parcel p1 = new Parcel(30, 30, 30, 15);  
        Parcel p2 = new Parcel(30, 35, 30, 40);        
        System.out.println(p1.validate(p1));
        System.out.println(p2.validate(p2));

    }

    
}
