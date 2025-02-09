package LinkedList;

public class AddNumbersLL {

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    static Node addTwoLists(Node num1, Node num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);

        Node sumNode = null;
        Node currSumNode = null;
        int carry = 0;
        while (carry != 0 || num1 != null || num2 != null) {
            int num1Data = num1 == null ? 0 : num1.data;
            int num2Data = num2 == null ? 0 : num2.data;
            int sum = num1Data + num2Data + carry;
            carry = sum / 10;
            sum %= 10;
            if (currSumNode == null) {
                currSumNode = new Node(sum);
                sumNode = currSumNode;
            }
            else {
                currSumNode.next = new Node(sum);
                currSumNode = currSumNode.next;
            }
            if (num1 != null) {
                num1 = num1.next;
            }
            if (num2 != null) {
                num2 = num2.next;
            }
        }

        sumNode = reverse(sumNode);
        while (sumNode.next != null && sumNode.data == 0) {
            sumNode = sumNode.next;
        }

        return sumNode;
    }
}
