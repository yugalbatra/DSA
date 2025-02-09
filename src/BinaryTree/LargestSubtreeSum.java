package BinaryTree;

public class LargestSubtreeSum {

    private static int maxSum = Integer.MIN_VALUE;

    public static int findLargestSubtreeSum(Node root) {
        sum(root);
        return maxSum;
    }

    private static int sum(Node root) {
        if (root == null) {
            maxSum = Math.max(maxSum, 0);
            return 0;
        }

        int sum = sum(root.left) + sum(root.right) + root.data;
        maxSum = Math.max(sum, maxSum);
        return sum;
    }
}
