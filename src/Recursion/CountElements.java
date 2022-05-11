package Recursion;

import java.util.Arrays;

public class CountElements {

    public static void countElements(int[] array, int max) {
        if (array.length == 0) {
            System.out.println(max);
            return;
        }

        if (array[0] > max) {
            countElements(Arrays.copyOfRange(array, 1, array.length), array[0]);
        }else {
            countElements(Arrays.copyOfRange(array, 1, array.length), max);
        }

    }

}
