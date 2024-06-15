package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySubsetOfAnotherArray {

    public String isSubset(long[] a1, long[] a2, long n, long m) {
        Map<Long, Integer> map = new HashMap<>();
        for (long i : a1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (long i : a2) {
            if (!map.containsKey(i) || map.get(i) == 0) {
                return "No";
            }

            map.put(i, map.get(i) - 1);
        }

        return "Yes";
    }
}
