package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

    static List<Integer> nextPermutation(int N, int[] arr) {
        int i = N - 2;
        while (i > 0) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
            i--;
        }

        if (i == 0) {
            final var list = new ArrayList<Integer>();
            for (int j = N - 1; j >= 0; j--) {
                list.add(arr[j]);
            }
            return list;
        }
        int min = i + 1, swap = i;
        for (int j = i + 2; j < N; j++) {
            if (arr[j] < arr[min] && arr[j] > arr[swap]) {
                min = j;
            }
        }

        arr[min] = arr[min] ^ arr[swap] ^ (arr[swap] = arr[min]);
        Arrays.sort(arr, i + 1, N);

        final var list = new ArrayList<Integer>();
        for (int j : arr) {
            list.add(j);
        }
        return list;
    }
}
