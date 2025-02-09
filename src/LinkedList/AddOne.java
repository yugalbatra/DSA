package LinkedList;

public class AddOne {

    public static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public static Node addOne(Node head) {
        head = reverse(head);
        Node temp = head;
        boolean carry = true;
        while (carry) {
            temp.data++;
            if (temp.data == 10) {
                temp.data = 0;
            }
            else {
                carry = false;
            }

            if (temp.next == null) {
                break;
            }

            temp = temp.next;

        }

        if (carry) {
            temp.next = new Node(1);
        }

        return reverse(head);
    }
}
