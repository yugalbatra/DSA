package LinkedList;

public class IntersactionTwoSortedLL {

    public static Node findIntersection(Node head1, Node head2) {
        Node head = null, curr = null;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                head1 = head1.next;
            }
            else if (head2.data < head1.data) {
                head2 = head2.next;
            }
            else {
                if (curr == null) {
                    curr = new Node(head1.data);
                    head = curr;
                }
                else {
                    curr.next = new Node(head1.data);
                    curr = curr.next;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return head;
    }
}
