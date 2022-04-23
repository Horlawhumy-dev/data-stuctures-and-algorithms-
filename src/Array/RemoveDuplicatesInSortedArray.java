package Array;

public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1; // being the index, to get the length of first sorted elements add 1.
    }

}

// Time Complexity => O(n)
//Space Complexity => O(1)