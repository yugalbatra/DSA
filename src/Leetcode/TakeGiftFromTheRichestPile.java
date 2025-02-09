package Leetcode;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;

public class TakeGiftFromTheRichestPile {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : gifts) {
            pq.offer(i);
        }

        for (int i = 0; i < k; i++) {
            int sqrt = (int) Math.sqrt(pq.poll());
            pq.offer(sqrt);
        }

        long giftCount = 0;
        while (!pq.isEmpty()) {
            giftCount += pq.poll();
        }

        return giftCount;
    }

    public static void main(String[] args) {
        System.out.println(new TakeGiftFromTheRichestPile().pickGifts(new int[] { 25, 64, 9, 4, 100 }, 4));
    }
}
