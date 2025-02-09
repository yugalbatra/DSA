package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousSmaller {

    static List<Integer> leftSmaller(int n, int[] a) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        stack.push(-1);
        for (int i = 0; i < n; i++) {
            int curr = a[i];
            while (stack.peek() >= curr) {
                stack.pop();
            }

            ans.add(stack.peek());
            stack.push(curr);
        }

        return ans;
    }
}
