package JavaEx4Sda;
/**
 * Author: Fatjon Rami
 * for the purpose of learning and practicing the Java programming language
 */

/*
Create a Storage class that will have a private Map field, a public constructor, and methods:
addToStorage(String key, String value) → adding elements to the storage
printValues(String key) → displaying all elements under a given key
findValues(String value) → displaying all keys that have a given value
The Storage class should allow you to store multiple values under one key
*/

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Storage {

    private Map<String, ArrayList<String>> storage;

    public Storage() {
        storage = new TreeMap<>();
    }

    // addToStorage(String key, String value) → adding elements to the storage
    public void addToStorage(String key, String value) {
        if (storage.containsKey(key)) {
            storage.get(key).add(value);
        } else {
            storage.put(key, new ArrayList<>());
            storage.get(key).add(value);
        }

    }

    // printValues(String key) → displaying all elements under a given key
    public void printValues(String key) {
        if (storage.containsKey(key)) {
            System.out.println(storage.get(key));
        } else {
            System.out.println("No such key");
        }
    }

    // findValues(String value) → displaying all keys that have a given value
    public void findValues(String value) {
        for (Map.Entry<String, ArrayList<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
}