package LinkedList;

public class FirstNodeOfLoop {
    public static int findFirstNode(Node head) {
        Node slow = head, fast = head;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }

            if (fast == null || fast.next == null) {
                return -1;
            }
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}
