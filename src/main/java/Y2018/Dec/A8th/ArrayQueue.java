package Y2018.Dec.A8th;

public class ArrayQueue {
    private String[] items;
    private int capacity;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity) {
        this.items = new String[capacity];
        this.capacity = capacity;
    }


    public boolean enqueue(String item) {
        if (tail == capacity) {
            if (head == 0) {
                return false;
            }
            //move items
            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            tail = tail - head;
            head = 0;
        }

        items[tail] = item;
        tail++;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }

        return items[head++];
    }
}
