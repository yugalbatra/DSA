package BinaryTree;

public class LeavesAtSameLevel {

    boolean check(Node root) {
        return check(root, height(root));
    }

    boolean check(Node root, int height) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return height == 1;
        }

        return check(root.left, height - 1) && check(root.right, height - 1);
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root .left), height(root.right)) + 1;
    }
}
