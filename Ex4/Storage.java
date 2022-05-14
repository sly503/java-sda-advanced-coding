package Ex4;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Storage {

    private Map<String, ArrayList<String>> storage;

    public Storage() {
        storage = new TreeMap<>();
    }

    public void addToStorage(String key, String value) {
        if (storage.containsKey(key)) {
            storage.get(key).add(value);
        } else {
            storage.put(key, new ArrayList<>());
            storage.get(key).add(value);
        }

    }

    public void printValues(String key) {
        if (storage.containsKey(key)) {
            System.out.println(storage.get(key));
        } else {
            System.out.println("No such key");
        }
    }

    public void findValues(String value) {
        for (Map.Entry<String, ArrayList<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
}