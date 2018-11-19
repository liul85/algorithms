package Y2018.Nov.A11th;

public class SingleLinkedList<T> {
    private Node<T> head;

    public SingleLinkedList() {

    }

    public SingleLinkedList(Node<T> head) {
        this.head = head;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public T getFirst() {
        if (head != null) {
            return head.data;
        }

        return null;
    }

    public T get(int index) {
        int point = 0;
        Node<T> current = head;
        while (point != index) {
            current = current.next;
            point++;
        }

        return current.data;
    }

    public T getLast() {
        Node<T> node = head;
        if (node == null) {
            return null;
        }

        while (node.next != null) {
            node = node.next;
        }

        return node.data;
    }

    public boolean contains(T value) {
        if (head == null) {
            return false;
        }

        Node<T> node = head;
        while (node.next != null) {
            if (node.data == value) {
                return true;
            }
            node = node.next;
        }

        return node.data == value;
    }

    public SingleLinkedList reverse() {
        if (head == null) {
            return new SingleLinkedList<T>(null);
        }

        Node<T> current = new Node<>(head.data, head.next);
        Node<T> prev = null;
        Node<T> headNode = null;

        while (current != null) {
            Node<T> nextNode = current.next;
            if (nextNode == null) {
                headNode = current;
            }
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return new SingleLinkedList<T>(headNode);
    }

    public Node<T> getNodeByIndex(int index) {
        int p = 0;
        Node<T> currentNode = head;
        while (p != index && currentNode != null) {
            currentNode = currentNode.next;
            p++;
        }

        return currentNode;

    }

    public boolean circled() {
        if (head == null) return false;

        Node slow = head;
        Node fast = head.next;

        while (slow != null && fast != null) {
            if (slow == fast) {
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public static class Node<K> {
        private Node<K> next;
        private K data;

        public Node(K data) {
            this.data = data;
        }

        public Node(K data, Node<K> next) {
            this.data = data;
            this.next = next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
