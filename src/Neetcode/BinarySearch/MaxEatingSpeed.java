package Neetcode.BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class MaxEatingSpeed {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;
        for (int i: piles) right = Math.max(right, i);

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int hours = calculateHours(piles, mid);
            if (hours > h) left = mid + 1;
            else right = mid - 1;
        }

        return left;
    }

    private int calculateHours(int[] piles, int mid) {
        int count = 0;
        for (int i: piles) {
            count += (i-1)/ mid + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        MaxEatingSpeed maxEatingSpeed = new MaxEatingSpeed();
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        System.out.println(maxEatingSpeed.minEatingSpeed(piles, h));
    }
}
