package JavaEx18Sda;


public class App {

    public static void main(String[] args) {
        
        //instantiate a new Computer object
        Computer computer1 = new Computer("Intel", 8, "Nvidia", "Dell", "XPS");
        Computer computer2 = new Computer("AMD", 16, "AMD", "Lenovo", "ThinkPad");
        Computer computer3 = new Computer("Intel", 16, "Nvidia", "HP", "Pavilion");

        //print out the computer object
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);

        //print out the computer object's properties
        System.out.println(computer1.getProcessor());
        System.out.println(computer1.getRam());
        System.out.println(computer1.getGraphicsCard());
        System.out.println(computer1.getCompany());
        System.out.println(computer1.getModel());

        //print out the computer object's properties
        System.out.println(computer2.getProcessor());
        System.out.println(computer2.getRam());
        System.out.println(computer2.getGraphicsCard());
        System.out.println(computer2.getCompany());
        System.out.println(computer2.getModel());

        //compare the computer objects
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.equals(computer3));

        //compare the computer objects' properties
        System.out.println(computer1.getProcessor().equals(computer2.getProcessor()));
        System.out.println(computer3.getRam() == computer2.getRam());
        System.out.println(computer1.getGraphicsCard().equals(computer3.getGraphicsCard()));

    }
    
}
