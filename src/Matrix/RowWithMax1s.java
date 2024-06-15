package Matrix;

public class RowWithMax1s {

    int rowWithMax1s(int[][] mat, int n, int m) {
        int max = 0;
        int r = 0, c = m - 1;
        while (r < n && c >= 0) {
            if (mat[r][c] == 1) {
                c--;
                max = r;
            }
            else {
                r++;
            }
        }

        return max;
    }
}
