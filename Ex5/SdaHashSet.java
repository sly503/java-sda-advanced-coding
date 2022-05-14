package Ex5;

//https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
import java.util.HashSet;

public class SdaHashSet<E> extends HashSet<E> {

    public boolean add(E e) {
        return super.add(e);
    }

    public boolean remove(Object o) {
        return super.remove(o);
    }

    public int size() {
        return super.size();
    }

    public boolean contains(Object o) {
        return super.contains(o);
    }

    public void clear() {
        super.clear();
        System.out.println("The set is cleared");
    }

}
