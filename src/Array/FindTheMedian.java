package Array;

import java.util.Arrays;

public class FindTheMedian {

    public int find_median(int[] v) {
        Arrays.sort(v);
        if (v.length % 2 == 0) {
            return (v[v.length / 2] + v[v.length / 2 - 1]) / 2;
        }
        return v[v.length / 2];
    }
}
