package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStack {

    static void reverse(Stack<Integer> s) {
        Queue<Integer> queue = new LinkedList<>();
        while (!s.isEmpty()) {
            queue.add(s.pop());
        }
        while (!queue.isEmpty()) {
            s.push(queue.poll());
        }
    }
}
