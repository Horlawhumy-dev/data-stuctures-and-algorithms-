package Array;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {5,6}, {7,8,9}};
        System.out.println(RotatedMatrix.rotateMatrix(matrix));
        System.out.println(Arrays.deepToString(matrix));
    }
}