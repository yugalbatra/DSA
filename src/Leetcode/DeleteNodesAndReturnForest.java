package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class DeleteNodesAndReturnForest {
    List<TreeNode> forest = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        deleteNodes(root, null, to_delete);
        forest.removeAll(null);
        return forest;
    }

    public void deleteNodes(TreeNode root, TreeNode parent, int[] toDelete) {
        if (root == null) {
            return;
        }
        Boolean left = parent != null ? parent.left == root : null;
        for (int i : toDelete) {
            if (root.val == i) {
                forest.remove(root);
                if (parent != null) {
                    if (parent.left == root) {
                        parent.left = null;
                    }
                    else {
                        parent.right = null;
                    }
                }
                forest.add(root.left);
                forest.add(root.right);
            }
        }
        TreeNode newParent = left != null ? left ? parent.left : parent.right : null;
        deleteNodes(root.left, newParent, toDelete);
        deleteNodes(root.right, newParent, toDelete);
    }
}
