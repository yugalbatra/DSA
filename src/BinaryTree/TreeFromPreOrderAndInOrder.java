package BinaryTree;

public class TreeFromPreOrderAndInOrder {

    public static Node buildTree(int[] inorder, int[] preorder, int n) {
        return buildTree(inorder, preorder, 0, 0, n);
    }

    public static Node buildTree(int[] inorder, int[] preorder, int i, int j, int n) {
        if (i >= inorder.length || j >= preorder.length || n == 0) {
            return null;
        }

        Node root = new Node(preorder[j]);
        int a = i, count = 0;
        while (root.data != inorder[a]) {
            a++;
            count++;
        }

        root.left = buildTree(inorder, preorder, i, j + 1, count);
        root.right = buildTree(inorder, preorder, a + 1, j + count + 1, n - count - 1);
        return root;
    }
}
