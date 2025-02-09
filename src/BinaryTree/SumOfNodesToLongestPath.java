package BinaryTree;

public class SumOfNodesToLongestPath {

    int maxHeight = 0, max = Integer.MIN_VALUE;

    public int sumOfLongRootToLeafPath(Node root) {
        helper(root, 0, 0);
        return max;
    }

    private void helper(Node root, int height, int sum) {
        if (root == null) {
            return;
        }

        sum += root.data;
        if (height > maxHeight) {
            max = sum;
            maxHeight = height;
        }
        if (height == maxHeight) {
            max = Math.max(sum, max);
        }
        helper(root.left, height + 1, sum);
        helper(root.right, height + 1, sum);
    }
}
