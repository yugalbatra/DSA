package Leetcode;

public class MinimumObstacleRemoval {

    public int minimumObstacles(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int obstacle = 0, m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        return minimumObstacles(grid, 0, 0, visited);
    }

    private int minimumObstacles(int[][] grid, int i, int j, boolean[][] visited) {
        if (i == grid.length - 1 && j == grid[i].length - 1) {
            return grid[i][j];
        }

        int val = grid[i][j], ans = 100000;
        if (isValid(i + 1, j, grid.length, grid[i].length, visited)) {
            visited[i + 1][j] = true;
            ans = Math.min(ans, minimumObstacles(grid, i + 1, j, visited));
            visited[i + 1][j] = false;
        }
        if (isValid(i - 1, j, grid.length, grid[i].length, visited)) {
            visited[i - 1][j] = true;
            ans = Math.min(ans, minimumObstacles(grid, i - 1, j, visited));
            visited[i - 1][j] = false;
        }
        if (isValid(i, j - 1, grid.length, grid[i].length, visited)) {
            visited[i][j - 1] = true;
            ans = Math.min(ans, minimumObstacles(grid, i, j - 1, visited));
            visited[i][j - 1] = false;
        }
        if (isValid(i, j + 1, grid.length, grid[i].length, visited)) {
            visited[i][j + 1] = true;
            ans = Math.min(ans, minimumObstacles(grid, i, j + 1, visited));
            visited[i][j + 1] = false;
        }

        return ans + val;
    }

    private boolean isValid(int i, int j, int m, int n, boolean[][] visited) {
        return i >= 0 && j >= 0 && i < m && j < n && !visited[i][j];
    }
}
