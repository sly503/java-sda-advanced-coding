package Ex1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C");

        System.out.println(sortList(list));
    }

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
