package Amazon.Day2;

public class TrappingRainWater {

    public int trap(int[] height) {
        int i = 0, j = height.length - 1;
        int water = 0, leftMax = height[i], rightMax = height[j];
        while (i < j) {
            if (leftMax < rightMax) {
                leftMax = Math.max(leftMax, height[++i]);
                water += leftMax - height[i];
            }
            else {
                rightMax = Math.max(rightMax, height[--j]);
                water += rightMax - height[j];
            }
        }

        return water;
    }
}
