package Recursion;

import java.util.Arrays;

public class SumOfArray {

    public static int sumOfElements(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        return array[0] + sumOfElements(Arrays.copyOfRange(array, 1, array.length));
    }
}
