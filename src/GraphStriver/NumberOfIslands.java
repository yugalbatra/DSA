package GraphStriver;

public class NumberOfIslands {

    private final int[][] dir = {
        {1, 0},
        {0, 1},
        {1, 1},
        {-1, -1},
        {-1, 0},
        {0, -1},
        {1, -1},
        {-1, 1}
    };

    public int countIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0;i < grid.length;i++) {
            for (int j = 0;j < grid[i].length; j++) {
                if (grid[i][j] == 'L' && !visited[i][j]) {
                    count++;
                    dfs(grid, i, j, visited);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;

        for (int[] arr: dir) {
            int newI = i + arr[0];
            int newJ = j + arr[1];
            if (isValid(newI, newJ, grid.length, grid[i].length) && grid[newI][newJ] == 'L' && !visited[newI][newJ]) {
                dfs(grid, newI, newJ, visited);
            }
        }
    }

    private boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
