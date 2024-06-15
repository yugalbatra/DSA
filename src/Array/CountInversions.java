package Array;

import java.util.Arrays;

public class CountInversions {
    /**
     * Bruteforce.
     */
//    static long inversionCount(long[] arr, long N) {
//        long count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
    static long mergeTwoSortedArrays(long[] arr, int left, int mid, int right) {
        long count = 0;
        long[] temp = new long[right - left + 1];
        int k = 0;
        int i = left, j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
                count += mid - i + 1;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        return count;
    }

    static long inversionCount(long[] arr, long N) {
        return merge(arr, 0, arr.length - 1);
    }

    static long merge(long[] arr, int left, int right) {
        int mid;
        long count = 0;
        if (right > left) {
            mid = (right + left) / 2;
            count = merge(arr, left, mid);
            count += merge(arr, mid + 1, right);
            count += mergeTwoSortedArrays(arr, left, mid, right);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(inversionCount(new long[] { 2, 4, 1, 3, 5 }, 5));
    }
}
