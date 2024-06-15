package Array;

public class CyclicallyRotateArray {

    public void rotate(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }
}
