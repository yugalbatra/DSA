package BinaryTree;

public class KSumPaths {

    int ans = 0;

    public int sumK(Node root, int k) {
        helper(root, k, false);
        return ans;
    }

    private void helper(Node root, int k, boolean started) {
        if (root == null) {
            return;
        }

        if (k == root.data) {
            ans++;
        }

        if (!started) {
            helper(root.left, k, false);
            helper(root.right, k, false);
        }

        helper(root.left, k - root.data, true);
        helper(root.right, k - root.data, true);
    }
}
