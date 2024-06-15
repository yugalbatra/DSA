package Matrix;

public class MedianInARowWiseSortedMatrix {

    int median(int[][] matrix, int r, int c) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][c - 1]);
        }

        int ans = -1;
        int medianCount = (r * c +1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = countLessThanOrEqual(matrix, mid);
            if (count < medianCount) {
                min = mid + 1;
            }
            else {
                max = mid;
            }
        }

        return min;
    }

    private int countLessThanOrEqual(final int[][] matrix, final int target) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            int min = 0;
            int max = matrix[i].length - 1;
            int mid = min + (max - min) / 2;
            while (min < max) {
                if (matrix[i][mid] <= target) {
                    min = mid + 1;
                }
                else {
                    max = mid;
                }
            }

            if (matrix[i][min] <= target) {
                count++;
            }

            count += min;
        }

        return count;
    }
}
