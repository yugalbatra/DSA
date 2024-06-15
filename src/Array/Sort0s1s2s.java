package Array;

import java.util.Arrays;

public class Sort0s1s2s {

    public static void sort0s1s2s(int[] arr) {
        int zero = 0, one = 0, two = 0;
        for (int i : arr) {
            if (i == 0) {
                zero++;
            }
            else if (i == 1) {
                one++;
            }
            else {
                two++;
            }
        }

        int i = 0;
        while (zero != 0) {
            arr[i++] = 0;
            zero--;
        }
        while (one != 0) {
            arr[i++] = 1;
            one--;
        }
        while (two != 0) {
            arr[i++] = 2;
            two--;
        }
    }

    public static void main(String[] args) {
        var arr = new int[] { 1,2,0,2,2,2,1,1,0,0,0,0,1,0,2,1,0};
        sort0s1s2s(arr);
        System.out.println(Arrays.toString(arr));
    }
}
