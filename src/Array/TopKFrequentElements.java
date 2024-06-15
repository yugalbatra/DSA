package Array;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] topKFrequentElements = new int[k];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(hashMap.values());
        list.sort(Collections.reverseOrder());
        for (int i = 0; i<topKFrequentElements.length;i++) {
            for (int key: hashMap.keySet()) {
                if(hashMap.get(key) == topKFrequentElements[i]) {
                    topKFrequentElements[i] = key;
                    hashMap.remove(key);
                    break;
                }
            }
        }

        return topKFrequentElements;
    }
}
