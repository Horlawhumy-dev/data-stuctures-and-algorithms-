import Random.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,848,4090, 4429, 663};
        List<Integer> arr = ElementGreaterThanAverage.findElementsGreaterThanAverage(array);
        System.out.println(arr);
        ReverseArrayOfIntegerValues res = new ReverseArrayOfIntegerValues();
        res.setArrayOfInteger(array);
        System.out.println(Arrays.toString(res.reverseArrayOfIntegers()));
    }
}