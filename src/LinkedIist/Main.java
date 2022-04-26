package LinkedIist;

public class Main {
    public static void main(String[] args) {
        LL<Integer> list = new LL<>();
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();

        LL<Integer> list2 = new LL<>();
        list2.insertFirst(17);
        list2.insertFirst(15);
        list2.insertFirst(13);
        list2.insertFirst(11);
        list2.display();

        LL<Integer> list3 = new LL<>();
        LL<Integer> result = list3.mergeSortedLL(list, list2);
        result.display();
    }
}
