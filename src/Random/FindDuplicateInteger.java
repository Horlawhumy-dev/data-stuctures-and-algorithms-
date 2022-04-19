package Random;

public class FindDuplicateInteger {

    public static boolean containDuplicates(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int j = i + 1; j < array.length - 1; ++j) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
