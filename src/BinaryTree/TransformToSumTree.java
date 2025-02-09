package BinaryTree;

import javax.print.DocFlavor;
import java.util.concurrent.TimeoutException;

public class TransformToSumTree {

    public void toSumTree(Node root) {
        sum(root);
    }

    private int sum(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            int temp = root.data;
            root.data = 0;
            return temp;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        int temp = root.data;
        root.data = left + right;
        return root.data + temp;
    }
}
