package Array;

public class KthSmallest {

    public static int count(int[] arr, int mid) {
        int count = 0;
        for (int i : arr) {
            if (i <= mid) {
                count++;
            }
        }

        return count;
    }

    public static int kthSmallest(int[] arr, int k) {
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;

        for (int i : arr) {
            high = Math.max(high, i);
            low = Math.min(low, i);
        }

        while (low < high) {
            int mid = (high + low) / 2;
            if (count(arr,mid) < k) {
                low = mid +1;
            }
            else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{1,52,3,87,66,4,29},6));
    }
}
