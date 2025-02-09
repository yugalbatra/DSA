package StacksAndQueues;

import java.util.Stack;

public class PostfixExpression {

    public static int evaluatePostFix(String S) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                stack.push(S.charAt(i) - '0');
                continue;
            }

            switch (S.charAt(i)) {
                case '+': {
                    stack.push(stack.pop() + stack.pop());
                    break;
                }
                case '-': {
                    stack.push(-stack.pop() + stack.pop());
                    break;
                }
                case '*': {
                    stack.push(stack.pop() * stack.pop());
                    break;
                }
                case '/': {
                    int den = stack.pop();
                    int num = stack.pop();
                    stack.push(num / den);
                    break;
                }
                case '^': {
                    int pow = stack.pop();
                    stack.push((int) Math.pow(stack.pop(), pow));
                }
            }
        }

        return stack.peek();
    }
}
