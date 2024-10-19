import java.util.Arrays;

public class GenericSorter<T extends Comparable<T>> {
    private T[] array;

    public GenericSorter(T[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public T[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 2};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        intSorter.sort();
        System.out.println(Arrays.toString(intSorter.getArray()));

        String[] strArray = {"Banana", "Apple", "Cherry"};
        GenericSorter<String> strSorter = new GenericSorter<>(strArray);
        strSorter.sort();
        System.out.println(Arrays.toString(strSorter.getArray()));
    }
}
