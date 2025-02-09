package BST;

import java.util.LinkedList;
import java.util.Queue;

public class PreOrderToBST {

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) {
            return null;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(preorder[0]);
        while (!queue.isEmpty()) {
            Integer nodeData = queue.poll();

        }

        return null;
    }
}
