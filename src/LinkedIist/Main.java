package LinkedIist;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLL<Integer> list = new CircularDoublyLL<>();
        list.insertNode(9);
        list.insertNode(8);
        list.insertNode(6);
        list.insertNode(4);
        list.insertNode(2);
        list.insertNode(1);
        list.printCurrentTail();
        list.printCurrentHead();
        list.displayLL();
        System.out.println( list.insertNodeAtIndex(8, 5));
        list.displayLL();

//        LL<Integer> list2 = new LL<>();
//        list2.insertFirst(17);
//        list2.insertFirst(15);
//        list2.insertFirst(13);
//        list2.insertFirst(11);
//        list2.display();
//
//        LL<Integer> list3 = new LL<>();
//        LL<Integer> result = list3.mergeSortedLL(list, list2);
//        result.display();
    }
}
