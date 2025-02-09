package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsorted {

    public Node removeDuplicates(Node head) {
        Set<Integer> set = new HashSet<>();
        Node prev = null, temp = head;
        while (head != null) {
            if (set.contains(head.data)) {
                prev.next = head.next;
                head = prev.next;
                continue;
            }

            set.add(head.data);
            prev = head;
            head = head.next;
        }

        return temp;
    }
}
