package StacksAndQueues;

import java.util.Stack;

public class HistogramMaxRectangleArea {

    public static long getMaxArea(long[] hist) {
        int[] previousSmaller = previousSmaller(hist);
        int[] nextSmaller = nextSmaller(hist);
        long maxArea = 0;

        for (int i = 0; i < hist.length; i++) {
            int width = nextSmaller[i] - previousSmaller[i] - 1;
            long height = hist[i];
            maxArea = Math.max(height * width, maxArea);
        }

        return maxArea;
    }

    private static int[] nextSmaller(final long[] hist) {
        int[] ans = new int[hist.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(hist.length);

        for (int i = hist.length - 1; i >= 0; i--) {
            while (stack.peek() != hist.length && hist[stack.peek()] >= hist[i]) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }

        return ans;
    }

    private static int[] previousSmaller(final long[] hist) {
        int[] ans = new int[hist.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < hist.length; i++) {
            while (stack.peek() != -1 && hist[stack.peek()] >= hist[i]) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }

        return ans;
    }
}
