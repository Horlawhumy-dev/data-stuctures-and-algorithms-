import Array.RemoveDuplicatesInSortedArray;
import Array.SquaresOfSortedArrays;
import LinkedIist.CLL;
import LinkedIist.DLL;

import java.util.Arrays;


public class Main {
    public static void main(String[] args)  {
        DLL<Integer> list = new DLL<>();
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(11);
        list.insertLast(90);
        list.insertLast(91);
        list.printCurrentTail();
        list.printCurrentHead();
        list.displayLL();
    }
}
