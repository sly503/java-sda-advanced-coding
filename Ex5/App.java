package Ex5;

public class App {

    public static void main(String[] args) {

        SdaHashSet<String> set = new SdaHashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.remove("A");
        set.size();
        System.out.println(set.contains("A"));
        System.out.println(set.contains("B"));
        System.out.println(set.size());
        set.clear();
    }
}
