package GoldmanSachs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class WaveArray {

    public static void convertToWaveUsingSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            arr[i] = arr[i] ^ arr[i + 1] ^ (arr[i + 1] = arr[i]);
        }
    }

    public static void convertToWave(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                arr[i] = arr[i] ^ arr[i - 1] ^ (arr[i - 1] = arr[i]);
            }
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                arr[i] = arr[i] ^ arr[i + 1] ^ (arr[i + 1] = arr[i]);
            }
        }
    }
}
