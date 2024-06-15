package Matrix;

import java.util.ArrayList;

public class SpirallyTraverseMatrix {

    static ArrayList<Integer> spirallyTraverse(int[][] matrix, int r, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }

        int round = 0;

        while (list.size() < matrix.length * matrix[0].length) {
            for (int i = round; i < matrix[0].length - round; i++) {
                list.add(matrix[round][i]);
            }
            if (list.size() >= matrix.length * matrix[0].length) {
                break;
            }
            for (int i = round + 1; i < matrix.length - round - 1; i++) {
                list.add(matrix[i][matrix[0].length - round - 1]);
            }

            if (list.size() >= matrix.length * matrix[0].length) {
                break;
            }
            for (int i = matrix[0].length - round - 1; i >= round; i--) {
                list.add(matrix[matrix.length - round - 1][i]);
            }
            if (list.size() >= matrix.length * matrix[0].length) {
                break;
            }
            for (int i = matrix.length - round - 2; i > round; i--) {
                list.add(matrix[i][round]);
            }

            round++;
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(spirallyTraverse(new int[][] { { 6, 6, 2, 28, 2 }, { 12, 26, 3, 28, 7 }, { 22, 25, 3, 4, 23 } }, 3, 5));
    }
}
