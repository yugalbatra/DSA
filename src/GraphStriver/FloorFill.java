package GraphStriver;

import java.util.LinkedList;
import java.util.Queue;

public class FloorFill {

    private final int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        bfs(image, sr, sc, image[sr][sc], newColor, new boolean[image.length][image[0].length]);
        return image;
    }

    private void bfs(int[][] image, int i, int j, int oldColor, int newColor, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while(!queue.isEmpty()) {
            int[] ele = queue.poll();
            image[ele[0]][ele[1]] = newColor;
            visited[ele[0]][ele[1]] = true;

            for (int[] arr: dir) {
                int newI = ele[0] + arr[0];
                int newJ = ele[1] + arr[1];
                if (isValid(newI, newJ, image.length, image[0].length) && (image[newI][newJ] == oldColor) && !visited[newI][newJ]) {
                    queue.add(new int[]{newI, newJ});
                }
            }
        }
    }

    private boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
