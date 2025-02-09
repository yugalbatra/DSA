package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagonalTraversal {

    public ArrayList<Integer> diagonal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            while (node != null) {
                if (node.left != null) {
                    queue.add(node.left);
                }
                list.add(node.data);
                node = node.right;
            }
        }

        return list;
    }
}
