package BinaryTree;

public class LCA {

    Node ansNode = null;

    Node lca(Node root, int n1, int n2) {
        helper(root, n1, n2);
        return ansNode;
    }

    private boolean[] helper(final Node root, final int n1, final int n2) {
        if (root == null) {
            return new boolean[2];
        }

        boolean[] left = helper(root.left, n1, n2);
        boolean[] right = helper(root.right, n1, n2);

        boolean[] ans = new boolean[2];
        ans[0] = root.data == n1 || left[0] || right[0];
        ans[1] = root.data == n2 || left[1] || right[1];
        if (ans[0] && ans[1] && ansNode == null) {
            ansNode = root;
        }
        return ans;
    }
}