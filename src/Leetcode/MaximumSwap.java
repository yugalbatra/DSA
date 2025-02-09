//package Leetcode;
//
//import java.util.Stack;
//
//public class MaximumSwap {
//
//    public int maximumSwap(int num) {
//        char[] str = String.valueOf(num).toCharArray();
//        Stack<Integer> stack = new Stack<>();
//        stack.push(-1);
//        for (int i = 0; i < str.length; i++) {
//            if (stack.peek() != -1 && str[i] > str[stack.peek()]) {
//                stack.pop();
//            }
//
//            stack.push(i);
//        }
//
//    }
//}
