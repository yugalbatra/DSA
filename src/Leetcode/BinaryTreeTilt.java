package Leetcode;

public class BinaryTreeTilt {

    int sum = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return sum;
    }

    public int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = postOrder(root.left);
        int right = postOrder(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }
}
