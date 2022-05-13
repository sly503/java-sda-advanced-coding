package Ex23;

import java.util.Map;
import java.util.TreeMap;

/*
Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your
animals:
int getNumberOfAllAnimals() → returns the number of all animals
Map <String, Integer> getAnimalsCount() → returns the number of animals of each species
Map <String, Integer> getAnimalsCountSorted() → returns the number of animals of each species
sorted based on the number of animals of a given species, where the first element is always the species with
the largest number of animals
void addAnimals(String, int) → adds n animals of a given species
*/

public class Zoo {

    private Map<String, Integer> animalsCount;

    public Zoo() {
        animalsCount = new TreeMap<>();
    }

    public int getNumberOfAllAnimals() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : animalsCount.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    public Map<String, Integer> getAnimalsCount() {
        return animalsCount;
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(animalsCount);
        return sortedMap;
    }

    public void addAnimals(String species, int n) {
        if (animalsCount.containsKey(species)) {
            animalsCount.put(species, animalsCount.get(species) + n);
        } else {
            animalsCount.put(species, n);
        }
    }

    // to string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number of all animals: ").append(getNumberOfAllAnimals()).append("\n");
        sb.append("Animals count: ").append(getAnimalsCount()).append("\n");
        sb.append("Animals count sorted: ").append(getAnimalsCountSorted()).append("\n");
        return sb.toString();
    }

}