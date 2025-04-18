package Neetcode.Stack;

import java.util.*;

public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], (double) (target - position[i]) / speed[i]);
        }

        double minTime = Integer.MAX_VALUE;
        int count = 1;
        for (final var time : map.values()) {
            if (time <= minTime) {
                minTime = time;
            } else {
                count++;
            }
        }

        return count;
    }
}
