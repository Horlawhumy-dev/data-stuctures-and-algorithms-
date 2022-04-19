
package Random;

public class LargestElementInArray {

    public static int findLargestElement(int[] array) {
        if (array.length == 0) {
            return -1;
        } else if (array.length == 1) {
            return array[0];
        } else {
            int max = array[0];
            for(int element: array) {
                if (element > max) {
                    max = element;
                }
            }

            return max;
        }
    }
}
