
package Random;

import java.util.ArrayList;
import java.util.List;

public class ElementGreaterThanAverage {

    public static List<Integer> findElementsGreaterThanAverage(int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        if (array.length == 0) {
            return result;
        }else {
            for (int element : array) {
                sum += element;
            }
        }

        float average = (float)sum / (float)array.length;

        for(int el: array) {
            if ((float)el > average) {
                result.add(el);
            }
        }

        return result;
        }
    }
