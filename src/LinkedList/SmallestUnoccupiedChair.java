package LinkedList;

import java.util.*;

public class SmallestUnoccupiedChair {

    public int smallestChair(int[][] times, int targetFriend) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean[] occupied = new boolean[times.length];
        int arrivalTime = times[0][0];
        for (int i = 0; i < times.length; i++) {
            if (i == targetFriend) {
                arrivalTime = times[i][0];
            }
        }

        Arrays.sort(times, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < times.length; i++) {
            for (int k = 0; k < i; k++) {
                if (times[k][1] <= times[i][0]) {
                    if (map.containsKey(k)) {
                        occupied[map.get(k)] = false;
                        map.remove(k);
                    }
                }
            }

            int j = 0;
            while (occupied[j]) {
                j++;
            }

            if (times[i][0] == arrivalTime) {
                return j;
            }

            occupied[j] = true;
            map.put(i, j);
        }

        int i = 0;
        while (times[i][0] != arrivalTime) {
            i++;
        }

        return map.get(i);
    }
}
