package BinaryTree;

public class KthAncestor {
    int count = 0, ans = 0;

    public int kthAncestor(Node root, int k, int node) {
        count = k;
        helper(root, node);
        return ans;
    }

    private boolean helper(Node root, int node) {
        if (root == null) {
            return false;
        }

        if (root.data == node) {
            return true;
        }

        boolean left = helper(root.left, node);
        boolean right = helper(root.right, node);
        if (left || right) {
            if (--count == 0) {
                ans = root.data;
            }
        }

        return left || right;
    }
}
