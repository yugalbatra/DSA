package BinaryTree;

public class MinimumDistanceBetweenTwoNodes {
    public static void main(String[] args) {

    }
    Node lca = null;

    int findDist(Node root, int a, int b) {
        Node lca = lca(root, a, b);
        return findAtHeight(lca, a) + findAtHeight(lca, b);
    }

    private int findAtHeight(Node root, int n) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.data == n) {
            return 0;
        }

        int left = findAtHeight(root.left, n);
        int right = findAtHeight(root.right, n);

        return Math.min(left, right) + 1;
    }

    private Node lca(Node root, int a, int b) {
        helper(root, a, b);
        return lca;
    }

    private boolean[] helper(final Node root, final int a, final int b) {
        boolean[] ans = new boolean[2];
        if (root == null) {
            return ans;
        }

        boolean[] left = helper(root.left, a, b);
        boolean[] right = helper(root.right, a, b);
        ans[0] = root.data == a || left[0] || right[0];
        ans[1] = root.data == b || left[1] || right[1];
        if (ans[0] && ans[1] && lca == null) {
            lca = root;
        }
        return ans;
    }
}
