package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {

    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> list = new ArrayList<>();
        if (mat.length == 0 || mat[0][0] == 0) {
            return list;
        }

        boolean[][] visited = new boolean[mat.length][mat[0].length];
        visited[0][0] = true;
        addPath(mat, visited, list, "", 0, 0);
        return list;
    }

    private void addPath(int[][] mat, boolean[][] visited, ArrayList<String> list, String ans, int i, int j) {
        if (i == mat.length - 1 && j == mat[i].length - 1) {
            list.add(ans);
            return;
        }

        if (validIndex(mat, i + 1, j) && mat[i + 1][j] == 1 && !visited[i + 1][j]) {
            visited[i + 1][j] = true;
            addPath(mat, visited, list, ans + "D", i + 1, j);
            visited[i + 1][j] = false;
        }
        if (validIndex(mat, i, j - 1) && mat[i][j - 1] == 1 && !visited[i][j - 1]) {
            visited[i][j - 1] = true;
            addPath(mat, visited, list, ans + "L", i, j - 1);
            visited[i][j - 1] = false;
        }
        if (validIndex(mat, i, j + 1) && mat[i][j + 1] == 1 && !visited[i][j + 1]) {
            visited[i][j + 1] = true;
            addPath(mat, visited, list, ans + "R", i, j + 1);
            visited[i][j + 1] = false;
        }
        if (validIndex(mat, i - 1, j) && mat[i - 1][j] == 1 && !visited[i - 1][j]) {
            visited[i - 1][j] = true;
            addPath(mat, visited, list, ans + "U", i - 1, j);
            visited[i - 1][j] = false;
        }
    }

    private boolean validIndex(int[][] mat, int i, int j) {
        return i < mat.length && i >= 0 && j >= 0 && j < mat[i].length;
    }
}
