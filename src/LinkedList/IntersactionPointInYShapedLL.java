package LinkedList;

import javax.sound.midi.MidiFileFormat;
import java.util.HashSet;
import java.util.Set;

public class IntersactionPointInYShapedLL {

    int intersectPointExtraSpace(Node head1, Node head2) {
        Set<Node> set = new HashSet<>();
        while (head1 != null) {
            set.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (set.contains(head2)) {
                return head2.data;
            }

            head2 = head2.next;
        }

        return -1;
    }

    int intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return 0;
        }

        int n1 = 0, n2 = 0;
        Node temp = head1;
        while (temp != null) {
            temp = temp.next;
            n1++;
        }

        temp = head2;
        while (temp != null) {
            temp = temp.next;
            n2++;
        }

        while (n1 > n2) {
            head1 = head1.next;
            n1--;
        }
        while (n1 < n2) {
            head2 = head2.next;
            n2--;
        }

        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1 == null ? -1 : head1.data;
    }
}
