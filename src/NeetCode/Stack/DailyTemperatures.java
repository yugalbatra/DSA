package Neetcode.Stack;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(temperatures.length - 1);
        for (int i = temperatures.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            answer[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }

        return answer;
    }
}
