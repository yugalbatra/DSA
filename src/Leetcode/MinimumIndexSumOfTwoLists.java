package Leetcode;

import java.util.*;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> list = new ArrayList<>();
        int minIndexSum = list1.length + list2.length;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int indexSum = map.get(list2[i]) + i;
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    list = new ArrayList<>();
                }
                if (indexSum == minIndexSum) {
                    list.add(list2[i]);
                }
            }
        }

        String[] strings = new String[list.size()];
        int i = 0;
        for (String str : list) {
            strings[i++] = str;
        }

        return strings;
    }

    public String[] findRestaurantBasic(String[] list1, String[] list2) {
        int minIndexSum = list1.length + list2.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (minIndexSum > i + j) {
                        list = new ArrayList<>();
                        minIndexSum = i + j;
                    }
                    if (minIndexSum == i + j) {
                        list.add(list1[i]);
                    }
                }
            }
        }

        String[] strings = new String[list.size()];
        int i = 0;
        for (String str : list) {
            strings[i++] = str;
        }

        return strings;
    }
}
