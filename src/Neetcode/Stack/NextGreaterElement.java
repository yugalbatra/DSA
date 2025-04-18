package Neetcode.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {

    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            ans.add(0, stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }

        return ans;
    }
}
