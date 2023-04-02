package seminar_03;

public class seminar_03_task_01_myLisr {
    Node Head;
    private class Node{
        int value;
        Node next;
    }

//    public Node pushFront(int value){
//        Node node = new Node();
//        node.value = value;
//        Node current = Head;
//
//        if(current != null){
//            node.next = Head;
//        }
//        Head = node;
//        return node;
//    }


    public Node pushBack(int value){
        Node node = new Node();
        node.value = value;
        Node current = Head;

        if(current == null){
            Head = node;
        }else{
            while(current.next != null)
                current = current.next;
            current.next = node;
        }
        return node;
    }

//    public void popBack(){
//        Node current = Head;
//
//        if(current != null){
//            while(current.next != null && current.next.next != null)
//                current = current.next;
//            if(current.next == null)
//                Head = null;
//        }
//    }

    public void print(){
        Node current = Head;
        while(current != null){
            System.out.printf("%d ", current.value);
            current = current.next;
        }
    }

//    public Node find(int value){
//        Node current = Head;
//        while(current != null){
//            if(current.value == value){
//                return current;
//            }
//            current = current.next;
//        }
//        return null;
//    }
}

