package String;

import java.util.Stack;

public class ParenthesisChecker {

    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        for (char ch: x.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.add(ch);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop()!='{') return false;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop()!='(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop()!='[') return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
