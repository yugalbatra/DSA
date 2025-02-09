package LinkedList;

public class RemoveLoop {
    public static void removeLoop(Node head) {
        Node slow = head, fast = head;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }

            if (fast == null || fast.next == null) {
                return;
            }
        }

        if (head == slow) {
            while (slow.next != head) {
                slow = slow.next;
            }

        }
        else {
            Node temp = head;
            while (temp.next != slow.next) {
                slow = slow.next;
                temp = temp.next;
            }
        }
        slow.next = null;
    }
}
