package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 7, 2, 5, 6, 0, -2};
        QuickSort.quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

}
