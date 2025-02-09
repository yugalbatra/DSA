package LinkedList;

public class MergeSortLL {

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHead = slow.next;
        slow.next = null;
        head = mergeSort(head);
        secondHead = mergeSort(secondHead);

        head = mergeTwoSortedLL(head, secondHead);

        return head;
    }

    static Node mergeTwoSortedLL(Node head, Node secondHead) {
        Node newHead = null, temp = null;
        while (head != null || secondHead != null) {
            int head1Data = head != null ? head.data : Integer.MAX_VALUE;
            int head2Data = secondHead != null ? secondHead.data : Integer.MAX_VALUE;
            if (head1Data < head2Data) {
                if (newHead == null) {
                    newHead = new Node(head1Data);
                    temp = newHead;
                }
                else {
                    temp.next = new Node(head1Data);
                    temp = temp.next;
                }
                head = head.next;
            }
            else {
                if (newHead == null) {
                    newHead = new Node(head2Data);
                    temp = newHead;
                }
                else {
                    temp.next = new Node(head2Data);
                    temp = temp.next;
                }
                if (secondHead != null) {
                    secondHead = secondHead.next;
                }
            }
        }

        return newHead;
    }
}
