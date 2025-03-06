package BST;

public class KthLargestInBST {
    public int kthLargest(Node root, int k) {
        int[] result = new int[2];
        kthLargest(root, k, result);
        return result[1];
    }

    private void kthLargest(final Node root, final int k, final int[] result) {
        if (root == null) {
            return;
        }
        kthLargest(root.right, k, result);
        if (++result[0] == k) {
            result[1] = root.data;
            return;
        }
        kthLargest(root.left, k, result);
    }
}
