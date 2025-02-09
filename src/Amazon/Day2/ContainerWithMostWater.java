package Amazon.Day2;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) {
                j--;
            }
            else if (height[i] < height[j]) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }

        return max;
    }
}
