package Matrix;

import java.util.Stack;

public class MaxRectangle {

    private int[] nextSmallerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (stack.peek() != -1 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }

        return ans;
    }

    private int[] prevSmallerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (stack.peek() != -1 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }

        return ans;
    }

    private int maxAreaHistogram(int[] arr, int n) {
        int[] nextSmaller = nextSmallerElement(arr);
        int[] prevSmaller = prevSmallerElement(arr);
        int max = 0;
        for (int i = 0; i < n; i++) {
            int length = arr[i];
            if (nextSmaller[i] == -1) {
                nextSmaller[i] = n;
            }
            int breadth = nextSmaller[i] - prevSmaller[i] - 1;

            int area = length * breadth;
            max = Math.max(area, max);
        }

        return max;
    }

    public int maxArea(int[][] M, int n, int m) {
        int max = 0;
        int[] histogram = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] == 1) {
                    histogram[j]++;
                }
                else {
                    histogram[j] = 0;
                }
            }

            max = Math.max(max, maxAreaHistogram(histogram, m));
        }

        return max;
    }
}
