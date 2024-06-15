package Array;

import java.util.ArrayList;

public class CommonIn3SortedArrays {
    ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0, j = 0, k = 0; i < n1 && j < n2 && k < n3; ) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (arrayList.isEmpty() || arrayList.get(arrayList.size() - 1) != A[i]) {
                    arrayList.add(A[i]);
                }
                i++;
                j++;
                k++;
            }
            else if (A[i] < B[j] || A[i] < C[k]) {
                i++;
            }
            else if (B[j] < A[i] || B[j] < C[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        return arrayList;
    }
}
