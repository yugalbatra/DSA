package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SingleElementInASortedArray {

    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        if (arr.size() == 1) {
            return arr.get(0);
        }
        int start = 0, end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0) {
                return arr.get(mid).equals(arr.get(mid + 1)) ? -1 : arr.get(mid);
            }
            else if (mid == arr.size() - 1) {
                return arr.get(mid).equals(arr.get(mid - 1)) ? -1 : arr.get(mid);
            }
            else if (!arr.get(mid).equals(arr.get(mid - 1)) && !arr.get(mid).equals(arr.get(mid + 1))) {
                return arr.get(mid);
            }
            else if (arr.get(mid).equals(arr.get(mid - 1))) {
                if (mid % 2 == 0) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (mid % 2 != 0) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
