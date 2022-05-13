package Ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        int[] array = generateRandomArray(100000,10000);

        System.out.println(Arrays.toString(array));
        System.out.println(findUniqueElements(array));
        System.out.println(findRepeatedElements(array));
        System.out.println(findMostFrequentElements(array));

    }

    // array generator
    public static int[] generateRandomArray(int size, int maxValue) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * maxValue);
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

    // return 25 elements of the list that have been repeated the most
    public static ArrayList<Integer> findMostFrequentElements(int[] array) {
        ArrayList<Integer> popularList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : array) {
            Integer count = map.get(i);
            map.put(i, count != null ? count + 1 : 1);
        }
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(25).forEach(x -> popularList.add(x.getKey()));
        return popularList;

    }
    

}