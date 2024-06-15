package Array;

import java.util.Arrays;

public class TrappingRainWater {

    static long trappingWater(int[] arr, int n) {
        int[] waterTrapped = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            waterTrapped[i] = max - arr[i];
        }
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            waterTrapped[i] = Math.min(waterTrapped[i], max - arr[i]);
        }

        long sum =0;
        for (int i: waterTrapped) sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        trappingWater(new int[]{3,0,0,2,0,4}, 6);
    }
}
