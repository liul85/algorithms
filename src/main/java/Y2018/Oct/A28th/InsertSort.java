package Y2018.Oct.A28th;

public class InsertSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] collection) {
        if (collection.length <= 1) return;

        for (int i = 1; i < collection.length; i++) {
            T value = collection[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (lessThan(value, collection[j])) {
                    collection[j + 1] = collection[j];
                } else {
                    break;
                }
            }
            collection[j+1] = value;
        }
    }
}
