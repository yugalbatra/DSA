package LinkedList;

public class IsCircularLL {

    boolean isCircular(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node temp = head.next;
        while (head != temp && temp != null) {
            temp = temp.next;
        }

        return temp != null;
    }
}
