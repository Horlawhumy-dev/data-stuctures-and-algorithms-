package LinkedIist;

public class LL<T extends Comparable<T>>{
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public void insertFirst(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(head);
        head = node;
        if (tail == null){
            tail = head; //this is done once
        }
        size++;
    }

    public void findDuplicatesInLinkedList() {
        Node<T> node = head;
        while(node != null && node.next != null) {
            if (node.getData() == node.next.getData()) {
                node.next = node.next.next;
            }
            node = node.next;

        }
    }


    public void insertLast(T value){
        Node<T> node = new Node<>(value);
        node.setNext(null);
        if(head ==  null){
            head = node;
            tail = head;
            return;
        }
        tail.setNext(node);
        tail = node;
        size++;
    }

    public int insertNodeAtIndex(T value, int index) {
        // guard before anything
        if (index >= size) {
            return -1;
        }
        Node<T> node = new Node<>(value);
        Node<T> prevNode = getPrevNode(index); // get previous node before the position of the new node
        node.setNext(prevNode.next); // setting the node at the specific index as the next one to the new node
        prevNode.setNext(node); //setting the next node of the previous node to the new node
        size++;
        return size;
    }

    public void deleteNode(String type) {
        if (type.equalsIgnoreCase("first")) {
            Node<T> node = head;
            head = node.next;
            size--;
        }
        if (type.equalsIgnoreCase("last")) {
           Node<T> prevNode = getPrevNode(size-1);
            tail = prevNode;
           prevNode.setNext(null);
           size--;
        }

    }

    public Node<T> deleteNodeAtAnyIndex(int index) {
        Node<T> prevNode = getPrevNode(index);
        Node<T> node = prevNode.next;
        prevNode.setNext(prevNode.next.next);
        size--;
        return node;
    }

    public T findNodeElement(int index){
        Node<T> prevNode = getPrevNode(index);
        return prevNode.next.getData();
    }

    public Node<T> findMidElement() {
        Node<T> fast = head;
        Node<T> slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public LL<Integer> mergeSortedLL(LL<Integer> l1, LL<Integer> l2) {
        LL<Integer> l3 = new LL<>();

        Node<Integer> h1 = l1.head;
        Node<Integer> h2 = l2.head;

        while(h1 != null && h2 != null) {
            if (h1.getData() < h2.getData()) {
                l3.insertLast(h1.getData());
                h1 = h1.next;
            }else {
                l3.insertLast(h2.getData());
                h2 = h2.next;
            }
        }
        // if this reaches null quickly, it will not run.
        // Only one of these loops will run except both are of equal length.
        while (h1 != null){
            l3.insertLast(h1.getData());
            h1 = h1.next;
        }
        // if this reaches null quickly, it will not run.
        while (h2 != null) {
            l3.insertLast(h2.getData());
            h2 = h2.next;
        }
        return l3;
    }

    // this is getting the previous node to the index
    public Node<T> getPrevNode(int index) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (i == index-1) {
                return current;
            }
            current = current.getNext();
        }
        return current;
    }

    public void printCurrentTail() {
        System.out.println(tail.getData());

    }

    public void printCurrentHead() {
        System.out.println(head.getData());

    }

    public int getSize() {
        return size;
    }

    public void display() {
        Node<T> current = head;
        while(current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println(" END");

    }
}
