package BinaryTree;

public class BalancedTree {

    boolean balanced = true;

    boolean isBalanced(Node root) {
        height(root);
        return balanced;
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) {
            balanced = false;
            return 0;
        }
        return Math.max(left, right) + 1;
    }
}
