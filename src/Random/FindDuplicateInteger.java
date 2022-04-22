package Random;

import java.util.HashSet;

public class FindDuplicateInteger {
    // fair solution
    // Time complexity => O(n)
    // Space complexity => O(n)
    public static boolean getDuplicate(int[] array) {
        HashSet<Integer> set = new HashSet<>(); // set does not contain duplicate
        for (int element: array) {
            if (set.contains(element)) {
                return true;
            }
            set.add(element);
        }
        return false;
    }

//     Brute force solution
//    Time Complexity => O(n*n)
//     space complexity => O(1)
    public static boolean containDuplicates(int[] array) {
        for(int i = 0; i < nums.length-1; ++i) {
            for(int j = i + 1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
