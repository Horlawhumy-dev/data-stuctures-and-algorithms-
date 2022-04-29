package Sorting;

public class BubbleSort {
    /*
        This algorithm sorts the array in ascending order by passing the biggest number at the 
        last index for the first iteration and subsequent loops.
        Time Complexity is -> O(n*n)
        Space Complexity -> O(1)
     */
    
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
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
