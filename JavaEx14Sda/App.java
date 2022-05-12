package JavaEx14Sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        int[] array = generateRandomArray(100);

        System.out.println(Arrays.toString(array));
        System.out.println(findUniqueElements(array));
        System.out.println(findRepeatedElements(array));
        System.out.println(findMostFrequentElements(array));

    }

    // array generator
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // return a list of unique items,
    public static ArrayList<Integer> findUniqueElements(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                uniqueList.add(entry.getKey());

            }
        }
        return uniqueList;

    }

    // return a list of elements that have been repeated at least once
    public static ArrayList<Integer> findRepeatedElements(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> repeatedList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedList.add(entry.getKey());
            }
        }

        return repeatedList;
    }

    // return a list of the 25 most frequently recurring items.
    public static ArrayList<Integer> findMostFrequentElements(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> mostFrequentList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                mostFrequentList.add(entry.getKey());
            }
        }
        return mostFrequentList;
    }

}
