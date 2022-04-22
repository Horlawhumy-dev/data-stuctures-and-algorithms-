package LinkedIist;

public class Node<T extends Comparable<T>> {
    protected T data;
    public Node<T> next;

    protected Node(T data) {
        this.data = data;
        setNext(null);
    }

//    public <T extends Comparable<T>> Node(LL<T> value) {
//    }

    protected void setNext(Node<T> next) {
        this.next = next;
    }

    protected Node<T> getNext() {
        return this.next;
    }

    protected void setData(T data) {
        this.data = data;
    }

    protected T getData() {
        return data;
    }

    public String toString() {
        return String.valueOf(data);
    }

}
