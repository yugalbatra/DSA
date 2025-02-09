package BST;

public class MinimumElementInBST {

    int minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }
}
