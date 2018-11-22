package Y2018.Nov.A18th;

public class ArrayStack<T> {
    private Object[] dataArray;
    private int count;
    private int size;

    public ArrayStack(int size) {
        this.size = size;
        this.dataArray = new Object[size];
        this.count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public T push(T i) {
        if (count >= size) {
            ensureCapacity();
        }

        dataArray[count] = i;
        count++;
        return i;
    }

    private void ensureCapacity() {
        Object[] newDataArray = new Object[size * 2];
        System.arraycopy(dataArray, 0, newDataArray, 0, count);

        dataArray = newDataArray;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T e = (T) dataArray[count - 1];
        count--;
        return e;
    }
}
