package Recursion;

public class PrintNthNumber {

    public static void printNth(int n) {
        if (n <= 0) {
            System.out.println("Not supported number!");
            return;
        }
        System.out.print(n + " ");
        printNth(n-1);
    }
}
