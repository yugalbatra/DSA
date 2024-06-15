package Matrix;

import java.util.Arrays;

public class SortMatrix {

    int[][] sortedMatrix(int n, int[][] mat) {
        int[] arr = new int[n * n];
        int k = 0;

        for (int[] ints : mat) {
            for (int i : ints) {
                arr[k++] = i;
            }
        }

        Arrays.sort(arr);
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arr[k++];
            }
        }

        return mat;
    }
}
