package JavaEx6Sda;

import java.util.TreeMap;

/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */
// Create a method that accepts TreeMap and prints the first and last EntrySet
// in the console.
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
