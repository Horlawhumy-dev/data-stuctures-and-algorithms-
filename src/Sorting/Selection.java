package Sorting;

public class Selection {
    /*
        At every iteration, this algorithm will be detecting the minimum number and then
        swap with the first element which sorts the whole array ascending.
        Time Complexity -> O(n*n)
        Space Complexity -> O(1)
     */

    public static void selectionSort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int maxIndex = getMaxIndex(array, 0, last);
            swap(array, last, maxIndex);
        }
    }

    public static int getMaxIndex(int[] array, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void selectionSort(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }



    private static void swap(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
