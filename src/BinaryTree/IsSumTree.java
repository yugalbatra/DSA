package BinaryTree;

public class IsSumTree {

    boolean sumTree = true;

    boolean isSumTree(Node root) {
        sum(root);
        return sumTree;
    }

    private int sum(final Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        if (left + right != root.data) {
            sumTree = false;
            return 0;
        }
        return left + right + root.data;
    }
}
