package Arrays;

import java.util.ArrayList;

public class MergeTwoSortedArrays {

    public static void mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = (m+n-1);
         while(i>=0 && j>=0) {
             if (nums1[i] > nums2[j]) {
                 nums1[k--] = nums1[i--];
             }else{
                 nums1[k--] = nums2[j--];
             }

         }

         while(i>=0) {
             nums1[k--] = nums1[i--];
         }
         while(j>=0) {
             nums1[k--] = nums2[j--];
         }
    }
}

// Time complexity => O(n+m)
//Space complexity => O(1)
