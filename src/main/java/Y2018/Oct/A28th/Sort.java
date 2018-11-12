package Y2018.Oct.A28th;

public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] collection);

    boolean lessThan(T first, T second) {
        return first.compareTo(second) < 0;
    }

    void swap(T[] collection, int origIndex, int desIndex) {
        T temp = collection[origIndex];
        collection[origIndex] = collection[desIndex];
        collection[desIndex] = temp;
    }
}
