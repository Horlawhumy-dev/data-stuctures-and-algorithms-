package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
    /*
        Time Complexity => O(n)
        Space Complexity => O(1)
     */
    public static void sortColors(int[] colors) {
        if (colors.length == 0) {
            return;
        }

        System.out.println(Arrays.toString(helper2(colors)));
    }

    private static void helper(int[] colors, int end, int start, int maxIndex) {
        //base case to avoid infinite recursion
        if (end == 0) {
            return;
        }

        if (start <= end) {
            if (colors[start] > colors[maxIndex]) {
                // this is to get maximum element index
                helper(colors, end, start+1, start);
            }else {
                // this is to get maximum element index
                helper(colors, end, start+1, maxIndex);
            }
        }else {
            swap(colors, maxIndex, end);
            // swapping the maximum element with the last element at every recursive calls while start index is less than end.
            helper(colors, end-1, 0, 0);
        }

    }

    private static int[] helper2(int[] nums) {
        int i = 0;
        int j = 0;
        int k = 0;
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        int[] result = new  int[left.length + right.length];
        helper3(i, j, k, left, right,result);
        return result;
    }

    private static void helper3(int i, int j, int k, int[] left, int[] right, int[] result) {

        if (i < left.length && j < right.length) {
            if (left[i] <= right[j] ) {
                result[k] = left[i];
                i++;
            }else {
                result[k] = right[j];
                j++;
            }
            k++;
            helper3(i, j, k, left, right,result);
        }

        helper4(i, j, k, left, right,result);
    }

    private static void helper4(int i, int j, int k, int[] left, int[] right, int[] result) {
        if (i == left.length || j == right.length) {
            return;
        }

        if (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
            helper4(i, j, k, left, right,result);
        }
        if (j < right.length) {
             result[k] = right[j];
             j++;
             k++;
             helper4(i, j, k, left, right,result);
        }
    }

    private static void swap(int[] colors, int maxIndex, int end) {
         int temp = colors[maxIndex];
         colors[maxIndex] = colors[end];
          colors[end] = temp;
    }
}
