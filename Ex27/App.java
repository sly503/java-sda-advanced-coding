package Ex27;

public class App {
    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-", new Integer[]{1, 2, 3, 4});
        System.out.println(joiner.join());

        Joiner<String> joiner2 = new Joiner<>("-", new String[]{"a", "b", "c", "d"});
        System.out.println(joiner2.join());
        
    }
}
