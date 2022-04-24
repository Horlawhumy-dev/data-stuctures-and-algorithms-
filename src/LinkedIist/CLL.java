package LinkedIist;

public class CLL <T extends Comparable<T>>{
    Node<T> head = null;
    Node<T> tail = null;

    int size;

    public CLL() {
        int size = 0;
    }

    public int getSize() {
        return size;
    }

   public void insertNode(T data){
       Node<T> node = new Node<>(data);
       if(head == null) {
           head = node;
           tail = node;
       }
       tail.next = node;
       tail = node;
       node.next = head;
       size++;
   }

   public void insertNodeAtValue(T val, T data){
        Node<T> node = new Node<>(data);
        Node<T> prevNode = getNodeBefore(val);
        node.next = prevNode.next;
        prevNode.next = node;
        size++;
   }

   public Node<T> getNodeBefore(T val) {
        Node<T> currNode = head;
        for (int i=1; i < size; i++) {
            if (currNode.next.getData() == val) {
                return currNode;
            }
            currNode = currNode.next;
        }
        return currNode;
   }

    public void deleteNode(T data) {
        Node<T> node = getNodeBefore(data);
        if (node.next.getData() == data) {
            node.next = node.next.next;
        }else {
            System.out.println("Data not found!");
        }
        size--;
    }

   public void display() {
        Node<T> currentNode = head;
        while(currentNode.next.getData() != head.getData()) {
            System.out.print(currentNode.getData() + " => ");
            currentNode = currentNode.getNext();
        }
       System.out.print(currentNode.getData() + " => ");
       System.out.print(" END");

   }

    private static class Node<T extends Comparable<T>>{
        private T data;
        private Node<T> next;

        public Node(T val) {
            setData(val);
//            setNext(null);

        }

        public void setData(T val) {
            this.data = val;
        }

        public T getData() {
            return this.data;
        }
//
//        public void setNext(Node<T> next) {
//            this.next = next;
//        }

        public Node<T> getNext() {
            return this.next;
        }
    }
}
