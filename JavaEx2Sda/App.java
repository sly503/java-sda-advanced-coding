import java.util.ArrayList;
import java.util.List;

/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */
public class JavaEx2Sda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("d");
        System.out.println(sortList(list));
        System.out.println(sortList2(list));

    }

    // Create a method that takes a string list as a parameter, then returns that
    // list sorted alphabetically from Z to A case-insensitive.

    public static List<String> sortList(List<String> list) {
        List<String> sortedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            int index = 0;
            for (int j = 0; j < sortedList.size(); j++) {
                if (current.compareToIgnoreCase(sortedList.get(j)) < 0) {
                    index = j;
                    break;
                }
            }
            sortedList.add(index, current);

        }
        return sortedList;
    }

    // using streams return a list sorted alphabetically from Z to A
    // case-insensitive.
    public static List<String> sortList2(List<String> list) {
        return list.stream().sorted((s2, s1) -> s1.compareToIgnoreCase(s2)).collect(ArrayList::new, ArrayList::add,
                ArrayList::addAll);
    }
}