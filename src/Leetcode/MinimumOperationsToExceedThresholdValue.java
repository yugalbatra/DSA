package Leetcode;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValue {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(nums).forEach(pq::add);
        int count = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            int first = pq.poll();
            int second = pq.poll();
            int exp = Math.min(first, second) * 2 + Math.max(first, second);
            pq.add(exp < 0 ? Integer.MAX_VALUE : exp);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumOperationsToExceedThresholdValue().minOperations(new int[]{1000000000,999999999,1000000000,999999999,1000000000,999999999}, 1000000000));
    }
}
