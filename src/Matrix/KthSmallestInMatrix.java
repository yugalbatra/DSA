package Matrix;

public class KthSmallestInMatrix {

    public static int kthSmallest(int[][] mat, int n, int k) {
        if (n == 0) {
            return 0;
        }

        int min = mat[0][0];
        int max = mat[n - 1][n - 1];
        int ans = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int count = rank(mat, mid);
            if (count < k) {
                min = mid + 1;
            }
            else {
                ans = mid;
                max = mid - 1;
            }
        }

        return ans;
    }

    private static int rank(final int[][] mat, final int mid) {
        int i = 0, rank = 0, j = mat.length - 1;
        while (i < mat.length && j >= 0) {
            if (mat[i][j] > mid) {
                j--;
            }
            else {
                rank += j + 1;
                i++;
            }
        }

        return rank;
    }
}
