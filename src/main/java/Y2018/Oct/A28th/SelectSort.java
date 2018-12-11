package Y2018.Oct.A28th;

public class SelectSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] collection) {
        for (int i = 0; i < collection.length; i++) {
            int min = getMin(collection, i);
            swap(collection, i, min);
        }
    }

    private int getMin(T[] collection, int start) {
        int minIndex = start;
        T minValue = collection[start];
        for (int i = start; i < collection.length; i++) {
            if (lessThan(collection[i], minValue)) {
                minIndex = i;
                minValue = collection[i];
            }
        }

        return minIndex;
    }
}
