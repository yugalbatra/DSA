package Matrix;

import java.util.*;

public class CommonElementsInAllRows {

    public static List<Integer> getCommonElementsOfAllRows(final int[][] mat) {
        List<Integer> list = new ArrayList<>();
        if (mat.length == 0) {
            return list;
        }

        int m = mat.length, n = mat[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(mat[0][i], 1);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map.containsKey(mat[i][j]) && map.get(mat[i][j]) == i) {
                    map.put(mat[i][j], map.get(mat[i][j]) + 1);
                    if (map.get(mat[i][j]) == m) {
                        list.add(mat[i][j]);
                    }
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] mat =
            {
                { 1, 2, 1, 4, 8 },
                { 3, 7, 8, 5, 1 },
                { 8, 7, 7, 3, 1 },
                { 8, 1, 2, 7, 9 },
            };

        System.out.println(getCommonElementsOfAllRows(mat));
    }
}
