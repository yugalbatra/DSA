package Array;

import java.util.Arrays;

public class TripletSumInArray {

    public static boolean twoSum(int[] arr, int i, int x) {
        for (int j = arr.length - 1; i < j; ) {
            if (arr[i] + arr[j] == x) {
                return true;
            }
            else if (arr[i] + arr[j] > x) {
                j--;
            }
            else {
                i++;
            }
        }

        return false;
    }

    public static boolean find3Numbers(int[] arr, int n, int x) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (twoSum(arr, i + 1, x - arr[i])) {
                return true;
            }
        }
        return false;
    }
}
