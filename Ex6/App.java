package Ex6;

import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        printFirstAndLastEntrySet(map);

    }

    public static void printFirstAndLastEntrySet(TreeMap<String, String> map) {

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

    }

}
