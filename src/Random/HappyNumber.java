package Random;

import java.util.HashSet;

public class HappyNumber {
    /*
    Using fast and slow pointer to detect whether a number is happy or not.
    19 => 1^2 + 9^2 = 82 => 8^2 + 2^2 = 68 => 6^2 + 8^2 = 100 => 1^2 + 0^2 + 0^2 = 1 => true
    19 -> 82 -> 68 -> 100 -> 1
    If not a happy number, there will be a time when the numbers will be equal.
    Time Complexity -> O(log(n))
    Space Complexity -> O(1)
    */
    public static boolean isHappy(int num) {
        int slow = num;
        int fast = getSquaresOfDigits(num);
        // No point in checking number less than or equal to zero

        while (fast != 1 && slow != fast) {
            slow = getSquaresOfDigits(slow);
            fast = getSquaresOfDigits(getSquaresOfDigits(fast));
        }
        return fast == 1;

    }

    public static boolean isHappyOrNot(int n) {
        /*
        Time Complexity -> O(log(n))
        Space Complexity -> O(log(n))
         */
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSquaresOfDigits(n);

        }
        return n == 1;
    }

    // helper method to generate squares of digits for a given number i.e 19 => 1^2 + 9^2 = 82
    public static int getSquaresOfDigits(int number) {
        int ans = 0;
        while (number > 0) {
            int remainder = number % 10;
            ans += remainder * remainder;
            number /= 10;
        }
        return ans;
    }
}

