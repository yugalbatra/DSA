package Matrix;

import java.util.Arrays;

public class RotateMatrixBy90Degrees {

    public static void rotate90Clockwise(int[][] mat, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - j - 1][i];
                mat[n - j - 1][i] = mat[n - i - 1][n - j - 1];
                mat[n - i - 1][n - j - 1] = mat[j][n - i - 1];
                mat[j][n - i - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = new int[][] {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        rotate90Clockwise(mat, mat.length);
        for (int[] i : mat) {
            System.out.println(Arrays.toString(i));
        }
    }
}

