package Amazon.Day5;

import LinkedList.ListNode;

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k==1) return head;
        ListNode temp = head, prevNode, kthNode = null, nextNode;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        nextNode = temp.next;
        temp.next = null;
        ListNode newHead = reverse(head);
        prevNode = head;
        temp = nextNode;
        while (temp != null) {
            kthNode = temp;
            for (int i = 1; i < k && temp != null; i++) {
                temp = temp.next;
            }

            if (temp == null) break;
            nextNode = temp.next;
            temp.next = null;
            prevNode.next = reverse(kthNode);
            prevNode = kthNode;
            temp = nextNode;
        }

        prevNode.next = kthNode;

        return newHead;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode newHead = new ReverseNodesInKGroup().reverse(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
