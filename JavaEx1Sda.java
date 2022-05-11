import java.util.ArrayList;
import java.util.List;
/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */
public class JavaEx1Sda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C");

        System.out.println(sortList(list));
    }

    // Create a method that takes a string list as a parameter, then returns the
    // list sorted alphabetically from Z to A.

    public static List<String> sortList(List<String> list) {
        List<String> sortedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            int index = 0;
            for (int j = 0; j < sortedList.size(); j++) {
                if (current.compareTo(sortedList.get(j)) < 0) {
                    index = j;
                    break;
                }
            }
            sortedList.add(index, current);
        }

        return sortedList;

    }

    
    
    
}
