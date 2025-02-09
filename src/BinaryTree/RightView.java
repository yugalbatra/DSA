package BinaryTree;

import java.util.ArrayList;

public class RightView {

    int maxLevel = 0;

    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        rightView(root, list, 1);
        return list;
    }

    private void rightView(Node root, ArrayList<Integer> list, int level) {
        if (root == null) {
            return;
        }

        if (maxLevel < level) {
            maxLevel = level;
            list.add(root.data);
        }

        rightView(root.right, list, level + 1);
        rightView(root.left, list, level + 1);
    }
}
