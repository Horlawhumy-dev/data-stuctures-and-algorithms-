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
        head = node;
        if(tail ==  null){
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

    public void displayLL() {
        Node<T> current = head;
        while(current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println(" END");

    }
}
