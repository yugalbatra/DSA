package SearchingAndSorting;

import java.util.ArrayList;

public class ValueEqualToIndexValue {

    ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr[i]) {
                arrayList.add(i + 1);
            }
        }

        return arrayList;
    }
}
