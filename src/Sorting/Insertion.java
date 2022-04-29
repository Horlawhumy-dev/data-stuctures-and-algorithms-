package Sorting;

public class Insertion {
    /*
        This is algorithm inserts the minimum number at its correct index by traversing
        downward the array from its position.
        Time Complexity -> O(n*n)
        Space Complexity -> O(1)
     */
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
