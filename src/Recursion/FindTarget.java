package Recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class FindTarget {
    public static int findTargetIndex(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        return helper(array, 0, target);
    }

    public static int helper(int[] array, int index,  int target) {
        if (index == array.length) {
            return -1;
        }

        return array[index] == target ? index :  helper(array, index+1, target);
    }

    public static ArrayList<Integer> findTargetIndices(int[] array, int target) {
        if (array.length == 0) {
            return new ArrayList<>();
        }

        return helper3(array, 0, target);
    }



    public static ArrayList<Integer> helper2(int[] array, int index,  int target, ArrayList<Integer> arrayList) {
        // base case
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

        ArrayList<Integer> arrayListFromFormerCall = helper3(array, index+1, target);
        arrayList.addAll(arrayListFromFormerCall);
        return arrayList;
    }
}
