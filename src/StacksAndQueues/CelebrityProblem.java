package StacksAndQueues;

public class CelebrityProblem {

    public int celebrity(int[][] mat) {
        int celebrity = -1;
        for (int a = 0; a < mat.length; a++) {
            boolean cel = true;
            for (int i : mat[a]) {
                if (i == 1) {
                    cel = false;
                }
            }
            if (cel) {
                celebrity = a;
            }
        }
        if (celebrity == -1) {
            return -1;
        }
        for (int i = 0; i < mat.length; i++) {
            if (i == celebrity) {
                continue;
            }
            if (mat[i][celebrity] != 1) {
                return -1;
            }
        }

        return celebrity;
    }
}
