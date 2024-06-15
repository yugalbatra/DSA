package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSubsequence {

    static int findLongestConseqSubseq(int[] arr, int N) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : arr) {
            if (map.containsKey(i)) {
                continue;
            }
            if (map.containsKey(i - 1) && map.containsKey(i + 1)) {
                map.put(i, map.get(i + 1) + map.get(i - 1) + 1);
                map.put(i + map.get(i + 1), map.get(i));
                map.put(i - map.get(i - 1), map.get(i));
            }
            else if (map.containsKey(i - 1)) {
                map.put(i, map.get(i - 1) + 1);
                map.put(i - map.get(i - 1), map.get(i));
            }
            else if (map.containsKey(i + 1)) {
                map.put(i, map.get(i + 1) + 1);
                map.put(i + map.get(i + 1), map.get(i));
            }
            else {
                map.put(i, 1);
            }
            max = Math.max(map.get(i), max);
        }

        return max;
    }
}
