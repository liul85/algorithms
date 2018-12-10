package Y2018.Dec.A8th;

public class LinkedListQueue {
    private Node head;
    private Node tail;

    public boolean enqueue(String item) {
        if (head == null) {
            head = new Node(item);
            tail = head;
            return true;
        }

        Node node = new Node(item);
        tail.next = node;
        tail = node;
        return true;
    }

    public String dequeue() {
        if (head == null) {
            return null;
        }

        String data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }
    }
}
