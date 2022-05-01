package Recursion;

public class IsArraySorted {

    public static boolean isArraySorted(int[] array) {
        if (array.length == 0) {
            return false;
        }
        return helper(array, 0);
    }

    public static boolean helper(int[] array, int index) {
        if (array.length-1 == index) {
            return true;
        }

        if (array[index] <= array[index+1]) {
            return helper(array, index+1);
        }
        // This could also be done instead of the above condition
        // return array[index] <= array[index+1] &&  helper(array, index+1);
        return false;
    }
}
