package Array;

import java.util.HashMap;
import java.util.Map;

public class CountMoreThanNByKOccurrences {

    public int countOccurence(int[] arr, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > n / k) {
                map.put(i, Integer.MIN_VALUE);
                count++;
            }
        }

        return count;
    }
}
