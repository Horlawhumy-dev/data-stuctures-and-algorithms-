package Recursion;

public class Pattern {

    // helper() algorithm
    /*    1.2.3.4.5. -> columns
 rows. 1. * * * * *
       2. * * * *
       3. * * *
       4. * *
       5. *
     */


    // helper2() algorithm
    /*    1.2.3.4.5. -> columns
 rows. 1. *
       2. * *
       3. * * *
       4. * * * *
       5. * * * * *
     */


    public static void drawTriangle(int row, int col) {
        if (row < 0) {
            return;
        }
        helper(row, col);

        helper2(row, col);

    }

    public static void helper(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print(" * ");
            helper(row, col+1);
        }else {
            System.out.println();
            helper(row-1, 0);

        }
    }

    public static void helper2(int row, int col) {
        if (row == 5) {
            return;
        }

        if (col <= row) {
            System.out.print(" * ");
            helper2(row, col+1);
        }else {
            System.out.println();
            helper2(row+1, 0);

        }
    }
}
