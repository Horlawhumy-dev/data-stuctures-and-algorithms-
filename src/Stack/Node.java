package Stack;

public class Node<T>{
    public T data;
    public Node<T> next;

    public Node(T value) {
        setData(value);
        setNext(null);
    }

    public void setData(T value) {
        this.data = value;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }
}
