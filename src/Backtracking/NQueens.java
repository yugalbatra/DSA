package Backtracking;

import java.util.ArrayList;

public class NQueens {

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        boolean[][] placed = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i + 1);
            placed[i][0] = true;
            nQueen(placed, list, 1);
            placed[i][0] = false;
        }

        return ans;
    }

    private void nQueen(boolean[][] placed, ArrayList<Integer> list, int j) {
        if (j == placed.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < placed.length; i++) {
            if (validIndex(placed, i, j)) {
                list.add(i + 1);
                placed[i][j] = true;
                nQueen(placed, list, j + 1);
                list.remove(list.size() - 1);
                placed[i][j] = false;
            }
        }
    }

    private boolean validIndex(boolean[][] placed, int i, int j) {
        for (boolean[] booleans : placed) {
            if (booleans[j]) {
                return false;
            }
        }
        for (int a = 0; a < placed.length; a++) {
            if (placed[i][a]) {
                return false;
            }
        }
        int a = i, b = j;
        while (a >= 0 && b >= 0) {
            if (placed[a][b]) {
                return false;
            }
            a--;
            b--;
        }
        a = i;
        b = j;
        while (a < placed.length && b < placed.length) {
            if (placed[a][b]) {
                return false;
            }
            a++;
            b++;
        }

        a = i;
        b = j;
        while (a >= 0 && b < placed.length) {
            if (placed[a][b]) {
                return false;
            }
            a--;
            b++;
        }
        a = i;
        b = j;
        while (a < placed.length && b >= 0) {
            if (placed[a][b]) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
