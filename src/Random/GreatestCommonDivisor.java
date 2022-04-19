
package Random;

public class GreatestCommonDivisor {

    public static int euclidean(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            if (num1 < num2) {
                swapInteger(num1, num2);
            }

            return num1 % num2 == 0 ? num2 : euclidean(num2, num1 % num2);
        } else {
            return 1;
        }
    }

    private static void swapInteger(int x, int y) {
        int temp = x;
        x= y;
        y = temp;
    }
}
