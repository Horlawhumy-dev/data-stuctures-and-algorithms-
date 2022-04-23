package Array;

public class SquaresOfSortedArrays {

    public static int[] findSquaresOfArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}

// Time complexity => O(n*n)
// Space complexity => (n)