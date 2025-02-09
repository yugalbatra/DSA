package Leetcode;

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int temp = stack.pop() + stack.peek();
                    stack.push(temp - stack.peek());
                    stack.push(temp);
                    break;
                default:
                    stack.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
