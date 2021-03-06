package Ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("d", 4);

        System.out.println(map);
        printMap(map);
    }

    public static void printMap(Map<String, Integer> map) {
        // using treemap because its sorted and we can get the keys in order
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (entry.equals(sortedMap.lastEntry())) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ".");
            }
            if (!entry.equals(sortedMap.lastEntry())) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ",");
            }
        }
    }
}
