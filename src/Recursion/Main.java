package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 0, 6, 5};
//        0, 1, 2, 4, 6, 5
//        System.out.println(FindTarget.findTargetIndices(array, 5));
        SortColors.sortColors(array);
//        int mid = array.length / 2;
//        int[] left = Arrays.copyOfRange(array, 0, mid);
//        int[] right = Arrays.copyOfRange(array, mid, array.length);
//        System.out.println(Arrays.toString(right));
    }

}
