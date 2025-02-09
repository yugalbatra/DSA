package BinaryTree;

import java.util.*;

public class BottomView {

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Map<Node, Integer> horizontalPosition = new HashMap<>();
        horizontalPosition.put(root, 0);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                horizontalPosition.put(node.left, horizontalPosition.get(node) - 1);
            }
            if (node.right != null) {
                queue.add(node.right);
                horizontalPosition.put(node.right, horizontalPosition.get(node) + 1);
            }

            map.put(horizontalPosition.get(node), node.data);
        }

        for (final var key : map.keySet()) {
            list.add(map.get(key));
        }

        return list;
    }
}
