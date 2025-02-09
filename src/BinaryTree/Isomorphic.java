package BinaryTree;

public class Isomorphic {

    boolean isIsomorphic(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.data != root2.data) {
            return false;
        }

        boolean leftLeft = isIsomorphic(root1.left, root2.left);
        boolean leftRight = isIsomorphic(root1.left, root2.right);
        boolean rightRight = isIsomorphic(root1.right, root2.right);
        boolean rightLeft = isIsomorphic(root1.right, root2.left);
        return (leftLeft && rightRight) || (leftRight && rightLeft);
    }
}
