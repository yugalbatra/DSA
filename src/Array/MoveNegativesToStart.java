package Array;

import java.util.Arrays;

public class MoveNegativesToStart {

    public static void moveNegativesToStart(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] < 0) {
                i++;
                continue;
            }
            if (arr[j] > 0) {
                j--;
                continue;
            }

            arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
        }
    }

    public static void main(String[] args) {
        var arr = new int[] { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        moveNegativesToStart(arr);
        System.out.println(Arrays.toString(arr));
    }
}
