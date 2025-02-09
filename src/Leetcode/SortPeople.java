package Leetcode;

import java.util.*;

public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        int a = 0;
        for (int i: map.keySet()) {
            names[a++] = map.get(i);
        }

        return names;
    }

    public String[] sortPeopleHashMap(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        int a = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            names[a++] = map.get(heights[i]);
        }

        return names;
    }
}
