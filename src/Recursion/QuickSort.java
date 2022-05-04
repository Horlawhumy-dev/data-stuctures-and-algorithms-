package Recursion;

public class QuickSort {
    /*
    Time Complexity => O(n*n)
    Space Complexity = O(1)
     */
    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end-start) /2;
        int pivot = array[mid];

        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }
            while (pivot < array[end]) {
                end--;
            }
            if (start <= end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }
        quickSort(array, low, end);
        quickSort(array, start, high);
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
