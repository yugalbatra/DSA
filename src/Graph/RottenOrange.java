//package Graph;
//
//public class RottenOrange {
//
//    private boolean validIndex(int[][] grid, int i, int j) {
//        return i < grid.length && i >= 0 && j >= 0 && j < grid[i].length;
//    }
//
//    public int orangesRotting(int[][] grid) {
//        if (grid.length == 0) {
//            return 0;
//        }
//
//        boolean[][] fresh = new boolean[grid.length][grid[0].length];
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (grid[i][j] == 1) {
//                    fresh[i][j] = true;
//                }
//            }
//        }
//        return orangesRotting(grid, 0, 0, 0, new boolean[grid.length][grid[0].length], fresh);
//    }
//
//    public int orangesRotting(int[][] grid, int height, int i, int j, boolean[][] visited, boolean[][] fresh) {
//        if (grid[i][j] == 2) {
//            if (validIndex(grid, i - 1, j) && grid[i - 1][j] == 1) {
//
//            }
//        }
//    }
//}
