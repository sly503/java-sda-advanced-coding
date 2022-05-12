import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */
public class JavaEx3Sda {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("d", 4);

        System.out.println(map);
        printMap(map);
    }
    // Create a method that takes the map as a parameter, where the key is string
    // and the value number, and then
    // prints each map element to the console in the format: Key: <k>, Value: <v>.
    // There should be a comma at the
    // end of every line except the last, and a period at the last

    public static void printMap(Map<String, Integer> map) {
        // using treemap because its sorted and we can get the keys in order
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            // if last entry print . instead of ,
            if (entry.equals(sortedMap.lastEntry())) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ".");
            }
            if (!entry.equals(sortedMap.lastEntry())) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + ",");
            }
        }
    }
}
