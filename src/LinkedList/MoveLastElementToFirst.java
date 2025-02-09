package LinkedList;

import javax.print.AttributeException;

public class MoveLastElementToFirst {

    public Node move(Node head) {
        Node temp = head, prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
        temp.next = head;

        return temp;
    }
}
