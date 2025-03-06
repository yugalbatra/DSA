package Neetcode.Stack;

import javax.print.DocFlavor;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(s.charAt(i));
            }
            if ((ch == ')' && (stack.isEmpty() || stack.pop() != '('))
                || (ch == ']' && (stack.isEmpty() || stack.pop() != '['))
                || (ch == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
