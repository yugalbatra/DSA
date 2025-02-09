package BST;

public class LCAInBST {

    Node LCA(Node root, int n1, int n2) {
        if (root == null) return null;

        if (n1 > n2) {
            n1 = n1 ^ n2 ^ (n2 = n1);
        }
        if (root.data >= n1 && root.data <= n2) {
            return root;
        }

        if (root.data < n1) {
            return LCA(root.right, n1, n2);
        } else {
            return LCA(root.left, n1, n2);
        }
    }
}
