package BinaryTree;

public class DiameterOfBinaryTree {

    int max = 0;

    int height(Node node) {
        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);
        int dia = left + right + 1;
        max = Math.max(dia, max);
        return 1 + Math.max(left, right);
    }

    int diameter(Node root) {
        height(root);
        return max;
    }
}
