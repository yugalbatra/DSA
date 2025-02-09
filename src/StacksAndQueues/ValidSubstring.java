package StacksAndQueues;

import java.util.Stack;

public class ValidSubstring {

    static int findMaxLenWithStack(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || stack.isEmpty() || s.charAt(stack.peek()) == ')') {
                stack.push(i);
            }
            else {
                stack.pop();
            }
        }
        int len = s.length(), max = 0;
        while (!stack.isEmpty()) {
            max = Math.max(max, len - (len = stack.pop()) - 1);
        }

        max = Math.max(len, max);
        return max;
    }

    static int findMaxLen(String s) {
        int left = 0, right = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }

            if (left == right) {
                maxLen = Math.max(maxLen, left + right);
            }
            else if (right > left) {
                left = right = 0;
            }
        }

        left = right = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }

            if (left == right) {
                maxLen = Math.max(maxLen, left + right);
            }
            else if (left > right) {
                left = right = 0;
            }
        }

        return maxLen;
    }
}
