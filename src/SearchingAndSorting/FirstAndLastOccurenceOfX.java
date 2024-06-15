package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurenceOfX {

    ArrayList<Integer> find(int[] arr, int n, int x) {
        int first = Integer.MAX_VALUE;
        int last = -1;
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                int check = mid;
                while (check >= 0 && arr[check] == x) {
                    first = Math.min(check, first);
                    check--;
                }
                check += 1;
                while (check < n && arr[check] == x) {
                    last = Math.max(check, last);
                    check++;
                }
            }
            if (arr[mid] < x) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        final var arraylist = new ArrayList<Integer>();
        arraylist.add(first == Integer.MAX_VALUE ? -1 : first);
        arraylist.add(last);
        return arraylist;
    }

    ArrayList<Integer> find(int[] arr, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0, j = arr.length - 1;
        int leftIndex = -1, rightIndex = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] < x) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
                leftIndex = mid;
            }
        }
        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] <= x) {
                i = mid + 1;
                rightIndex = mid;
            }
            else {
                j = mid - 1;
            }
        }
        arrayList.add((leftIndex >= 0 && arr[leftIndex] == x) ? leftIndex : -1);
        arrayList.add((rightIndex < arr.length && arr[rightIndex] == x) ? rightIndex : -1);
        return arrayList;
    }
}
