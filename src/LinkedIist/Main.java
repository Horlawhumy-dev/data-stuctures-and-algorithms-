package LinkedIist;

public class Main {
    public static void main(String[] args) {
        LL<Integer> list = new LL<>();
        list.insertLast(9);
        list.insertLast(8);
        list.insertLast(1);
        list.insertLast(9);
        list.insertLast(4);
        list.insertLast(1);
        list.insertLast(9);
        list.getKthToLast(9);
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
