package StacksAndQueues;

import java.util.Stack;

public class ReverseAString {

    public String reverse(String S) {
        Stack<Character> stack = new Stack<>();
        for (char ch : S.toCharArray()) {
            stack.push(ch);
        }

        char[] arr = new char[S.length()];
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i++] = stack.pop();
        }

        return String.valueOf(arr);
    }
}
