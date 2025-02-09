package Leetcode;

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            int k = i;
            int num = matrix[i][0];
            for (int j = 0; j < matrix[i].length && k < matrix.length; j++, k++) {
                if (num != matrix[k][j]) {
                    return false;
                }
            }
        }

        for (int j = 1; j < matrix[0].length; j++) {
            int k = j;
            int num = matrix[0][j];
            for (int i = 0; i < matrix.length && k < matrix[i].length; i++, k++) {
                if (matrix[i][k] != num) {
                    return false;
                }
            }
        }

        return true;
    }
}
