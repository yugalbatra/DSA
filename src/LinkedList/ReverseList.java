package LinkedList;

public class ReverseList {

    Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    Node reverseListIterative(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node curr = head, prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
