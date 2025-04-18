package Neetcode.TwoPointers;

import java.util.Arrays;

public class TrappingRainWater {

    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
        int i = 0, j = height.length - 1;
        int sum = 0;
        while (i < j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);

            if (leftMax < rightMax) {
                sum += leftMax - height[i++];
            } else {
                sum += rightMax - height[j--];
            }
        }

        return sum;
    }

    public int trapWithExtraSpace(int[] height) {
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
