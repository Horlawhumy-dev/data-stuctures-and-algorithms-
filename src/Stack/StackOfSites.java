package Stack;

public class StackOfSites<T extends Comparable<T>> {
    public Node<T> top;
    public Node<T> bottom;
    public int length;

    public StackOfSites() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }


    public void push(T value) {
        Node<T> node = new Node<>(value);
        if(this.length == 0) {
           top = node;
           bottom = node;
           this.length++;
           return;
           //bottom.setNext(top);
        }
        Node<T> temp = top;
        top = node;
        temp.next = top;
        this.length++;
    }

    public T peek() {
        return this.top.getData();
    }

    public T pop() {
        Node<T> temp = top;
        return this.top.getData();
    }

    public void printStack() {
        Node<T> node = bottom;
        while (node.getNext() != null) {
            System.out.print(node.getData() + " -> ");
            node = node.getNext();
        }
        System.out.print("END");
    }
}
