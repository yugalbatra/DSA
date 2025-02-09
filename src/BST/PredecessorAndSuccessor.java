package BST;

public class PredecessorAndSuccessor {

    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        pre[0] = new Node(-1);
        suc[0] = new Node(-1);
        helper(root, pre, suc, key);
    }

    private static void helper(Node root, Node[] pre, Node[] suc, int key) {
        if (root == null) {
            return;
        }

        if (root.data == key) {
            if (root.right != null) {
                Node temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                suc[0] = temp;
            }
            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                pre[0] = temp;
            }
            return;
        }
        if (key < root.data) {
            suc[0] = root;
            helper(root.left, pre, suc, key);
        } else {
            pre[0] = root;
            helper(root.right, pre, suc, key);
        }
    }
}
