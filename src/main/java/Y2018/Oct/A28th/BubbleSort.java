package Y2018.Oct.A28th;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] collection) {
        for (int i = collection.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lessThan(collection[j + 1], collection[j])) {
                    swap(collection, j, j + 1);
                }
            }
        }
    }
}
