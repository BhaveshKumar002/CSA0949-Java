import java.util.Arrays;
import java.util.Comparator;

class GenericSorter<T> {
    private T[] array;

    public GenericSorter(T[] array) {
        this.array = array;
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(array, comparator);
    }

    public T[] getSortedArray() {
        return array;
    }
}

public class GenericSorting {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        intSorter.sort(Comparator.naturalOrder());
        System.out.println("Sorted Integer Array: " + Arrays.toString(intSorter.getSortedArray()));

        String[] stringArray = {"Banana", "Apple", "Orange", "Mango"};
        GenericSorter<String> stringSorter = new GenericSorter<>(stringArray);
        stringSorter.sort(Comparator.naturalOrder());
        System.out.println("Sorted String Array: " + Arrays.toString(stringSorter.getSortedArray()));
    }
}
