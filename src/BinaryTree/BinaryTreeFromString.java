package BinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BinaryTreeFromString {

    public static Node treeFromString(String s) {
        if (s.isEmpty()) {
            return null;
        }

        int i = 0, num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + s.charAt(i++) - '0';
        }
        Node root = new Node(num);
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Map<Node, Boolean> isLeft = new HashMap<>();
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                num = 0;
                if (s.charAt(i + 1) == ')') {
                    isLeft.put(stack.peek(), false);
                    i++;
                    continue;
                }
                while (Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + s.charAt(++i) - '0';
                }
                Node node = new Node(num);
                if (isLeft.getOrDefault(stack.peek(), true)) {
                    isLeft.put(stack.peek(), false);
                    stack.peek().left = node;
                    stack.push(node);
                }
                else {
                    stack.peek().right = node;
                    stack.push(node);
                }
            }
            if (s.charAt(i) == ')') {
                stack.pop();
            }
        }

        return root;
    }
}
