package BST;

public class CheckForBST {

    boolean isBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBST(Node root, int left, int right) {
        if (root == null) {
            return true;
        }

        if (root.data < left || root.data > right) return false;
        return isBST(root.left, left, root.data) && isBST(root.right, root.data, right);
    }
}
