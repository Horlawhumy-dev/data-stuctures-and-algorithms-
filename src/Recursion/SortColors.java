package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
    /*
        Time Complexity => O(n*logn)
        Space Complexity => O(n)
     */
    public static void sortColors(int[] colors) {
        if (colors.length == 0) {
            return;
        }
        System.out.println(Arrays.toString(mergeSort(colors)));
    }

    // Selection sort using recursion
    private static void helper(int[] colors, int end, int start, int maxIndex) {
        //base case to avoid infinite recursion
        if (end == 0) {
            return;
        }

        if (start <= end) {
            if (colors[start] > colors[maxIndex]) {
                // this is to get maximum element index
                helper(colors, end, start + 1, start);
            } else {
                // this is to get maximum element index
                helper(colors, end, start + 1, maxIndex);
            }
        } else {
            swap(colors, maxIndex, end);
            // swapping the maximum element with the last element at every recursive calls while start index is less than end.
            helper(colors, end - 1, 0, 0);
        }

    }

    private static void swap(int[] colors, int maxIndex, int end) {
        int temp = colors[maxIndex];
        colors[maxIndex] = colors[end];
        colors[end] = temp;
    }

    // Using Divide and Conquer Algorithm through merge sort
    private static int[] mergeSort(int[] colors) {
        if (colors.length == 1) {
            return colors;
        }

        int mid = colors.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(colors, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(colors, mid, colors.length));
        return merge(left, right);
    }


    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
}
