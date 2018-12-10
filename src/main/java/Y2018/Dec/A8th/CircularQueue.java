package Y2018.Dec.A8th;

public class CircularQueue {
    private String[] items;
    private int capacity = 0;
    private int head = 0;
    private int tail = 0;

    public CircularQueue(int capacity) {
        this.items = new String[capacity];
        this.capacity = capacity;
    }

    public boolean enqueue(String item) {
        if ((tail + 1) % capacity == head) {
            return false;
        }

        items[tail] = item;
        tail = (tail + 1) % capacity;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }

        String item = items[head];
        head = (head + 1) % capacity;
        return item;
    }
}
