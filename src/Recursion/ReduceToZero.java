package Recursion;

public class ReduceToZero {

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (detectEvenOrOdd(n)) {
            return helper(n/2, count+1);
        }
        return helper(n-1, count+1);
    }

    public static boolean detectEvenOrOdd(int n) {
        return n % 2 == 0;
    }
}
