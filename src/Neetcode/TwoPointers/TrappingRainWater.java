package Neetcode.TwoPointers;

import java.util.Arrays;

public class TrappingRainWater {

    public int trap(int[] height) {
        int[] water = new int[height.length];
        int maxTillNow = 0;
        for (int i = 0; i < height.length; i++) {
            maxTillNow = Math.max(maxTillNow, height[i]);
            water[i] = maxTillNow - height[i];
        }
        maxTillNow = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            maxTillNow = Math.max(maxTillNow, height[i]);
            water[i] = Math.min(water[i], maxTillNow - height[i]);
        }

        return Arrays.stream(water).sum();
    }
}
