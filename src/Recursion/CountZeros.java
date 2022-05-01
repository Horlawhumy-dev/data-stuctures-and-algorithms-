package Recursion;

public class CountZeros {

    /*
        302302 -> return 2

     */


    public static int countZeros(int n, int count) {
        int rem = n % 10;
        if (n == 0) {
            return count;
        }

        if (rem == 0) {
            return countZeros(n/10, count+1);
        }else {
            return countZeros(n/10, count);
        }

    }
}
