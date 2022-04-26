package Array;

public class RotatedMatrix {
    public static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 ||
                matrix[0].length != matrix.length ||
                matrix[1].length != matrix.length ||
                matrix[2].length != matrix.length) {
            return false;
        }

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                try {
                    int top = matrix[first][i];
                    matrix[first][i] = matrix[last - offset][first];
                    matrix[last - offset][first] = matrix[last][last - offset];
                    matrix[last][last - offset] = matrix[i][last];
                    matrix[i][last] = top;
                } catch (ArrayIndexOutOfBoundsException err) {
                    System.out.println("Index out of bound");
                }

            }
        }
        return true;
    }
}