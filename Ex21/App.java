package Ex21;

public class App {

    public static void main(String[] args) {
        
        Cone cone1 = new Cone(3, 4);

        System.out.println(cone1.calculateVolume());
        System.out.println(cone1.calculateArea());
        System.out.println(cone1.calculatePerimeter());



        Qube cube1 = new Qube(3);

        System.out.println(cube1.calculateVolume());
        System.out.println(cube1.calculateArea());
        System.out.println(cube1.calculatePerimeter());

        


    }
    
}
