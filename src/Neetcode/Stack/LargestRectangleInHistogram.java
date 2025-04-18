package Neetcode.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        int[] nextSmaller = nextSmaller(heights);
        int[] previousSmaller = previousSmaller(heights);

        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = nextSmaller[i] - previousSmaller[i] - 1;
            max = Math.max(width * heights[i], max);
        }

        return max;
    }

    private int[] previousSmaller(final int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        return ans;
    }

    private int[] nextSmaller(final int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }

        return ans;
    }
}
