package Amazon.Day5;

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

//@FunctionalInterface
interface  inter {
    int a();
}
class A {

    int    a;

    String name;

    public A(int a, String name) {
        this.a = a;
        this.name = name;
    }

}

//class B extends A {
//    public B() {
//        System.out.println(a);
//        System.out.println("In B");
//    }
//
//    public B(int b) {
//        System.out.println("in b Int");
//    }
//}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        inter inter = () -> 0;

        try {
            int a = 5/0;
            return;
        } catch (Exception e) {

        }
        finally
        {
            System.out.println("here");
        }

//        A a = new A(1, "Yugal");
//        A b = new A(1, "Yugal");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.equals(b));

//        Thread thread = new Thread(() -> System.out.println("Running in Runnable thread"));
//
//        thread.start();
//
//        System.out.println(
//            "Running in main thread");

//        System.out.println(" " + j + 1);
//        int[] numbers = { 1, 4, 3, 6, 2, 6 };
//        final var numberList = new ArrayList<Integer>();
//        final var list = new ArrayList<MergeTwoSortedLists>();
//        int i = '5';
//        System.out.println(i);
//
//        System.out.println(Arrays.stream(numbers)
//                                 .distinct()
//                                 .boxed()
//                                 .collect(Collectors.toList()));

//        List<Integer> anotherList = list.stream()
//                                        .filter(num -> num % 2 != 0)
//                                        .map(num -> Integer.parseInt(num + "1"))
//                                        .toList();
//        System.out.println(anotherList);
//        int factor = 2;
//        System.out.println(
//            list.stream()
//                .filter(number -> number % 2 == 0)
//                .mapToInt(e -> e * factor)
//                .sum());
//        list.sort(MergeTwoSortedLists::change);
//        numberList.sort(Integer::compareTo);
//        System.out.println(list);
    }

    public int change(MergeTwoSortedLists b) {
        return -1;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = new ListNode(-1), temp = head;
        ListNode prev1 = null, prev2 = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        temp.next = list1 != null ? list1 : list2;
        return head.next;
    }
}
