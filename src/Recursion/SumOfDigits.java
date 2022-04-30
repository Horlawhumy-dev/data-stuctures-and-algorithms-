package Recursion;

public class SumOfDigits {
    /*
        1342 -> 1 + 3 + 4 + 2
                1342 / 10 = 134 r 2
            134 / 10 = 13 r 4
            13 / 10 = 1 r 3
            1 / 10 = 0 r 1
            1342 % 10 = 2
            */

    public  static int sumDigits(int n) {
         if (n <= 0) {
             return -1;
         }

        if (n == 1) {
            return 1;
        }

        return n%10 + sumDigits(n/10);
    }
}
