import Arrays.MergeTwoSortedArrays;
import LinkedIist.LL;

import java.util.Arrays;


public class Main {
    public static void main(String[] args)  {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6,};
        int n =nums2.length;
        int m = nums1.length-n;
        MergeTwoSortedArrays.mergeTwoSortedArrays(nums1,m, nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}