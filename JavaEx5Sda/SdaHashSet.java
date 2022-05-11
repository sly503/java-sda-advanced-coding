package JavaEx5Sda;
//https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
import java.util.HashSet;
//Implement the SDAHashSet<E> class that will implement the HashSet<E> logic. It should support methods:
public class SdaHashSet<E> extends HashSet<E> {
    
    //add method
    public boolean add(E e) {
        return super.add(e);
    }
    //remove method
    public boolean remove(Object o) {
        return super.remove(o);
    }
    //size method
    public int size() {
        return super.size();
    }
    //contains method   
    public boolean contains(Object o) {
        return super.contains(o);
    }
    //clear method
    public void clear() {
        super.clear();
        System.out.println("The set is cleared");
    }

}
