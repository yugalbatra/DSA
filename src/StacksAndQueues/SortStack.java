package StacksAndQueues;

import java.util.Stack;

public class SortStack {

    public Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> ans = new Stack<>();
        while (!s.isEmpty()) {
            insertAtValid(ans, s.pop());
        }

        return ans;
    }

    private void insertAtValid(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int curr = stack.peek();
        if (curr > element) {
            stack.pop();
            insertAtValid(stack, element);
            stack.push(curr);
        } else {
            stack.push(element);
        }
    }
}
