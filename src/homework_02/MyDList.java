package homework_02;

import java.util.Objects;

public class MyDList {
    Node head;
    Node tail;

    public void print() {
        Node current = head;
        System.out.print(head.getValue() + " ");
        while (current.hasNext()) {
            System.out.print(current.next.getValue() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void pushFront(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            if (head.next == null) {
                head = node;
                head.next = tail;
                tail.prev = head;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
        }
    }

    public void sort() {
        boolean finish = true;
        do {
            finish = true;
            Node current = head;
            while (current.hasNext()) {

                if (current.getValue() > current.next.getValue()) {
                    int cache = current.getValue();
                    current.setValue(current.next.getValue());
                    current.next.setValue(cache);
                    finish = false;
                }

                current = current.next;
            }
        } while (!finish);
    }

    public void reverse(){
        Node currentFront = head;
        Node currentBack = tail;
        boolean check = true;
        while (check){
            int cache = currentFront.getValue();
            currentFront.setValue(currentBack.getValue());
            currentBack.setValue(cache);
            currentFront = currentFront.next;
            currentBack = currentBack.prev;
            check = reverseCheck(currentFront, currentBack);
        }
    }

    private boolean reverseCheck(Node first, Node second){
        boolean check = !first.prev.equals(second);
        if (first.equals(second)) {
            check = false;
        }
        return check;
    }

    private static class Node {
        private int value;
        Node next;
        Node prev;


        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public boolean hasNext() {
            return !(next == null);
        }

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }
    }
}