package Matrix;

public class SearchA2dMatrix {

    public boolean searchArray(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return true;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, end = matrix.length - 1, mid;
        for (int i = 0; i < matrix.length; i++) {
            mid = (start + end) / 2;
            if (matrix[mid][0] > target) {
                end = mid - 1;
            }
            else if (matrix[mid][matrix[0].length - 1] < target) {
                start = mid + 1;
            }
            else {
                if (searchArray(matrix[mid], target)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean searchMatrixEasy(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int row = 0, column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] < target) {
                row++;
            }
            else if (matrix[row][column] > target) {
                column--;
            }
            else {
                return true;
            }
        }

        return false;
    }
}
