package Ex2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("d");
        System.out.println(sortList(list));
        System.out.println(sortList2(list));

    }

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

    // using streams
    public static List<String> sortList2(List<String> list) {
        return list.stream().sorted((s2, s1) -> s1.compareToIgnoreCase(s2)).collect(ArrayList::new, ArrayList::add,
                ArrayList::addAll);
    }
}