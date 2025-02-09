package Leetcode;

public class RangeAddition {

    public int maxCount(int m, int n, int[][] ops) {
        int minX = m;
        int minY = n;

        for (int[] ints : ops) {
            minX = Math.min(ints[0], minX);
            minY = Math.min(ints[1], minY);
        }

        return minX * minY;
    }

    public int maxCountWaste(int m, int n, int[][] ops) {
        int[][] mat = new int[m][n];
        for (int[] ints : ops) {
            for (int i = 0; i < ints[0]; i++) {
                for (int j = 0; j < ints[1]; j++) {
                    mat[i][j]++;
                }
            }
        }

        int count = 0;
        int max = 0;
        for (final int[] ints : mat) {
            for (final int anInt : ints) {
                if (max == anInt) {
                    count++;
                }
                else if (max < anInt) {
                    count = 1;
                    max = anInt;
                }
            }
        }

        return count;
    }
}
