package BST;

public class InsertNodeInBST {

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (root.data == key) {
            return root;
        } else if (root.data > key) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }
}
