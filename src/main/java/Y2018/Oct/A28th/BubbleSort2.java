package Y2018.Oct.A28th;

public class BubbleSort2<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] collection) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < collection.length - 1; i++) {
                if (lessThan(collection[i + 1], collection[i])) {
                    swap(collection, i, i + 1);
                    swapped = true;
                }
            }
        }

    }
}
