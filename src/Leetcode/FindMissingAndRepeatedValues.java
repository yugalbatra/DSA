package Leetcode;

import java.util.Arrays;
import java.util.Map;

public class FindMissingAndRepeatedValues {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ele = Math.abs(grid[i][j]);
                int a = (ele - 1) / n, b = (ele - 1) % n;
                if (grid[a][b] < 0) {
                    ans[0] = Math.abs(grid[i][j]);
                    continue;
                }

                grid[a][b] *= -1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] >0) {
                    ans[1] = (i * n + j % n) + 1;
                }
            }
        }

        return ans;
    }
}
