package NeetCode.ArraysAndHashing;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequentSpaceFriendly(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        final var reverse = new HashMap<Integer, List<Integer>>();
        for (int key : map.keySet()) {
            if (!reverse.containsKey(map.get(key))) {
                reverse.put(map.get(key), new LinkedList<>());
            }

            reverse.get(map.get(key)).add(key);
        }

        List<Integer> sorted = reverse
                .keySet()
                .stream()
                .sorted(Collections.reverseOrder())
                .toList();

        int j = 0;
        int[] ans = new int[k];
        for (int i = 0; i < ans.length; ) {
            final var lst = reverse.get(sorted.get(j++));
            for (int num : lst) {
                ans[i++] = num;
            }
        }

        return ans;
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        final ArrayList<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int key : map.keySet()) {
            if (freq[map.get(key)] == null) {
                freq[map.get(key)] = new ArrayList<>();
            }

            freq[map.get(key)].add(key);
        }


        int[] ans = new int[k];
        int n = nums.length;
        int i = 0;
        for (int j = n; j > 0 && i < k; j--) {
            if (freq[j] != null) {
                for (int num : freq[j]) {
                    ans[i++] = num;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        final var ans = new TopKFrequentElements().topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        for (int i: ans) System.out.println(i);
    }
}
