package Array;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithSum0 {

    static boolean findsum(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        int currSum = 0;
        set.add(currSum);
        for (int i : arr) {
            currSum += i;
            if (set.contains(currSum)) {
                return true;
            }

            set.add(currSum);
        }

        return false;
    }
}
