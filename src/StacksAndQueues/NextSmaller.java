package StacksAndQueues;

import java.util.Stack;

public class NextSmaller {

    public static int[] help_classmate(int arr[], int n) {
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            while (stack.peek() >= curr) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(curr);
        }

        return ans;
    }
}
