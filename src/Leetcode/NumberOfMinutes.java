package Leetcode;

import java.util.Arrays;

public class NumberOfMinutes {

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        return informTime[headID] + numOfMinutes(n, headID, manager, informTime, headID);
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime, int i) {
        if (informTime[i] == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for (int a = 0; a < manager.length; a++) {
            if (manager[a] == headID) {
                int minutes = informTime[a] + numOfMinutes(n, a, manager, informTime, a);
                max = Math.max(minutes, max);
            }
        }

        return max;
    }
}
