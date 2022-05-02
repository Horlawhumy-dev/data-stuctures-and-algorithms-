package Recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class FindTarget {
    // this method works for only one index -> should incase, the targets are multiple,
    // it will return the first matched index.
    public static int findTargetIndex(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        return helper(array, 0, target);
    }

    public static int helper(int[] array, int index,  int target) {
        // Base case when the target could not be found
        if (index == array.length) {
            return -1;
        }

        return array[index] == target ? index :  helper(array, index+1, target);
    }

    // this returns all multiple indices matching the target.

    public static ArrayList<Integer> findTargetIndices(int[] array, int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array.length == 0) {
            return new ArrayList<>();
        }

        helper2(array, 0, target, arrayList);

        return arrayList;

        //return helper3(array, 0, target);
    }



    public static ArrayList<Integer> helper2(int[] array, int index,  int target, ArrayList<Integer> arrayList) {
        // base case when the recursion starts returning to the above function calls
        if (index == array.length) {
            return arrayList;
        }

        if (array[index] == target) {
            arrayList.add(index);
        }

        return helper2(array, index+1, target, arrayList);
    }

    public static ArrayList<Integer> helper3(int[] array, int index,  int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // base case
        if (index == array.length) {
            return arrayList;
        }

        if (array[index] == target) {
            arrayList.add(index);
        }
        // this solves the problem of recreating new empty array list at every function calls
        ArrayList<Integer> arrayListFromFormerCall = helper3(array, index+1, target);
        arrayList.addAll(arrayListFromFormerCall);
        return arrayList;
    }
}
