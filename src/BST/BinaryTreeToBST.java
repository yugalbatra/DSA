package BST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeToBST {

    Node binaryTreeToBST(Node root) {
        if (root == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        Collections.sort(list);
        return constructBST(list, 0, list.size() - 1);
    }

    private Node constructBST(final List<Integer> list, final int i, final int i1) {
        if (i > i1) {
            return null;
        }
        int mid = (i + i1) / 2;
        Node root = new Node(list.get(mid));
        root.left = constructBST(list, i, mid - 1);
        root.right = constructBST(list, mid + 1, i1);
        return root;
    }

    private void inorder(final Node root, final List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}
