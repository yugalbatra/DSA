package BinaryTree;

import java.util.*;

public class LeftView {

    int maxLvl = 0;

    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        leftView(root, list, 1);
        return list;
    }

    private void leftView(Node root, ArrayList<Integer> list, int level) {
        if (root == null) {
            return;
        }

        if (level > maxLvl) {
            maxLvl = level;
            list.add(root.data);
        }

        leftView(root.left, list, level + 1);
        leftView(root.right, list, level + 1);
    }

    ArrayList<Integer> leftViewBasic(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            list.add(queue.peek().data);
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return list;
    }
}
