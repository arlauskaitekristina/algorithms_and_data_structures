package homework_02;

public class MyList<T> {
    private Node<T> head;

    public void pushFront(T value) {
        Node<T> node = new Node<T>(value);
        Node<T> current = head;
        if (current != null) {
            node.next = head;
        }
        head = node;
    }

    public void pushBack(T value) {
        Node<T> node = new Node<T>(value);
        Node<T> current = head;
        if (current == null) {
            head = node;
        } else {
            while (current.hasNext())
                current = current.next;
            current.next = node;
        }
    }

    public void popBack() {
        Node<T> current = head;
        if (current != null) {
            while (current.hasNext() && current.next.hasNext())
                current = current.next;
            current.next = null;
        }
    }

    public void print() {
        Node<T> current = head;
        System.out.print(head.getValue() + " ");
        while (current.hasNext()){
            System.out.print(current.next.getValue() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node<T> find(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public T pullHead() {
        return head.getValue();
    }

    private class Node<T> {
        private T value;
        Node<T> next;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public boolean hasNext() {
            return !(next == null);
        }

        public Node(T value) {
            this.value = value;
        }
    }
}