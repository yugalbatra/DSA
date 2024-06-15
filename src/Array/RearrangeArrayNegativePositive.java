package Array;

import java.util.Arrays;

public class RearrangeArrayNegativePositive {

    public static void rearrangeArray(int[] arr) {
        int positive = 1, negetive = 0;
        for (int i = 0; i < arr.length; i++) {
            while (positive < arr.length && arr[positive] >= 0) {
                positive += 2;
            }
            while (negetive < arr.length && arr[negetive] < 0) {
                negetive += 2;
            }
            if ((i % 2 == 0 && i < negetive) || (i % 2 != 0 && i < positive)) {
                continue;
            }
            if (arr[i] > 0 && positive < arr.length) {
                arr[positive] = arr[positive] ^ arr[i] ^ (arr[i] = arr[positive]);
                positive += 2;
            }
            else if (arr[i] < 0 && negetive < arr.length) {
                arr[negetive] = arr[negetive] ^ arr[i] ^ (arr[i] = arr[negetive]);
                negetive += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
