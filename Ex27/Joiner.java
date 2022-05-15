package Ex27;

/*
Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
that allows you to specify any number of T-type objects. This method will return a string joining all passed
elements by calling their toString() method and separating them with a separator.
eg. for Integers and separator "-" it should return: 1-2-3-4 ...

*/
public class Joiner<T> {
    
    private String separator;
    private T[] array;

    public Joiner(String separator, T[] array) {
        this.separator = separator;
        this.array = array;
    }

    public String join() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i].toString());
            if (i < array.length - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

}
