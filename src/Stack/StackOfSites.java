package Stack;

public class StackOfSites<T extends Comparable<T>> {
    public Node<T> top;
    public int length;

    public StackOfSites() {
        this.top = null;
        this.length = 0;
    }


    public void push(T value) {
        Node<T> node = new Node<>(value);
        Node<T> prevNode = top;
        top = node;
        node.next = prevNode;
        this.length++;
    }

    public T peek() {
        return this.top.getData();
    }

    public T pop() {
        Node<T> temp = this.top;
        top = temp.next;
        this.length--;
        return temp.getData();
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void deleteStack() {
        this.top.setNext(null);
        this.length = 0;
    }


    public void printStack() {
        Node<T> node = top;
        while (node.next != null) {
            System.out.print(node.getData() + " -> ");
            node = node.next;
        }
        System.out.print(node.getData() + " -> ");
        System.out.println("END");
    }
}
