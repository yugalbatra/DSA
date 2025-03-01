package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KthDistinct {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String str : arr) {
            if (map.get(str) == 1) {
                if (--k == 0) {
                    return str;
                }
            }
        }

        return "";
    }
}
