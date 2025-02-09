package BinaryTree;

import java.util.ArrayList;
import java.util.Objects;

public class BoundaryTraversal {

    ArrayList<Integer> boundary(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        ans.add(root.data);
        if (root.left == null && root.right == null) {
            return ans;
        }
        if (root.left != null) {
            leftTraversal(root.left, ans);
        }
        leafNodeTraversal(root, ans);
        if (root.right != null) {
            rightTraversal(root.right, ans, ans.size());
        }

        return ans;
    }

    private void rightTraversal(final Node root, final ArrayList<Integer> list, int size) {
        if (root.left == null && root.right == null) {
            return;
        }
        list.add(size, root.data);
        rightTraversal(Objects.requireNonNullElseGet(root.right, () -> root.left), list, size);
    }

    private void leafNodeTraversal(final Node root, final ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        leafNodeTraversal(root.left, list);
        if (root.left == null && root.right == null) {
            list.add(root.data);
        }
        leafNodeTraversal(root.right, list);
    }

    private void leftTraversal(Node root, ArrayList<Integer> list) {
        if (root.left == null && root.right == null) {
            return;
        }
        list.add(root.data);
        leftTraversal(Objects.requireNonNullElseGet(root.left, () -> root.right), list);
    }
}
