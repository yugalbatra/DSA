package BinaryTree;

public class MaxSumNonAdjacent {

    static class Pair {
        int include;

        int exclude;

        Pair(int include, int exclude) {
            this.include = include;
            this.exclude = exclude;
        }
    }

    static int getMaxSum(Node root) {
        Pair ans = helper(root);
        return Math.max(ans.include, ans.exclude);
    }

    private static Pair helper(Node root) {
        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = helper(root.left);
        Pair right = helper(root.right);

        Pair curr = new Pair(0, 0);

        curr.include = root.data + left.exclude + right.exclude;
        curr.exclude = Math.max(left.include, left.exclude) + Math.max(right.include, right.exclude);

        return curr;
    }
}
