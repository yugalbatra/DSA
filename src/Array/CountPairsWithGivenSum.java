package Array;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

    int fact(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : arr) {
            if (map.containsKey(k-i)){
                count += map.get(k-i);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountPairsWithGivenSum().getPairsCount(new int[] { 1, 5, 7, 1, 2, 3, 5, 6, 2, 5, 2, 5, 12, 14 }, 4, 15));
    }
}
