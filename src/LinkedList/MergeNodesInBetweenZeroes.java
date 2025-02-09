package LinkedList;

public class MergeNodesInBetweenZeroes {

    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        int sum = 0;
        ListNode newHead = null, temp2 = null;
        while (temp != null) {
            if (temp.val == 0) {
                if (newHead == null) {
                    newHead = new ListNode(sum);
                    temp2 = newHead;
                }
                else {
                    temp2.next = new ListNode(sum);
                    temp2 = temp2.next;
                }
                sum = 0;
            }
            else {
                sum += temp.val;
            }
            temp = temp.next;
        }

        return newHead;
    }
}
