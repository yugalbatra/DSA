package BST;

public class PreOrderToBST {

    int i = 1;

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) {
            return null;
        }

        TreeNode treeNode = new TreeNode(preorder[0]);
        createBST(treeNode, preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return treeNode;
    }

    private void createBST(final TreeNode treeNode, final int[] preorder, final int minValue, final int maxValue) {
        if (i == preorder.length) {
            return;
        }

        if (preorder[i] > minValue && preorder[i] < treeNode.val) {
            treeNode.left = new TreeNode(preorder[i++]);
            createBST(treeNode.left, preorder, minValue, treeNode.val);
        }

        if (i == preorder.length) {
            return;
        }

        if (preorder[i] > treeNode.val && preorder[i] < maxValue) {
            treeNode.right = new TreeNode(preorder[i++]);
            createBST(treeNode.right, preorder, treeNode.val, maxValue);
        }
    }
}
