package BinaryTree;

public class BinaryTreeToDLL {

    Node linkedList;

    Node bToDLL(Node root) {
        Node dll = new Node(-1);
        linkedList = dll;
        inorder(root);
        return dll;
    }
    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (linkedList.data == -1) {
            linkedList.data = root.data;
        }
        else {
            linkedList.right = new Node(root.data);
            linkedList.right.left = linkedList;
            linkedList = linkedList.right;
        }
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        new BinaryTreeToDLL().bToDLL(root);
    }
}
