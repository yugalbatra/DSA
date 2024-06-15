package Array;

public class MedianOf2SortedArrays {

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merge[k] = arr1[i++];
            }
            else {
                merge[k] = arr2[j++];
            }
            k++;
        }

        while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merge[k++] = arr2[j++];
        }

        return merge;
    }

    static double medianOfArrays(int n, int m, int[] a, int[] b) {
        int[] mergedArray = mergeTwoSortedArrays(a, b);

        int len = mergedArray.length;
        if (len % 2 == 0) {
            return (mergedArray[len / 2] + mergedArray[len / 2 - 1]) / 2.0;
        }

        return mergedArray[len / 2];
    }
}
