package Array;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
        }
    }

    public static void reverseArrayRecursively(int[] arr) {
        reverseArrayRecursively(arr, 0, arr.length - 1);
    }

    private static void reverseArrayRecursively(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
        reverseArrayRecursively(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        var arr = new int[] { 1, 2, 3, 4, 5 };
        reverseArrayRecursively(arr);
        System.out.println(Arrays.toString(arr));
    }
}
