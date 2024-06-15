package Array;

public class SmallestSubarrayWithSumGreaterThanX {

    public static int smallestSubWithSum(int[] arr, int n, int x) {
        int sum = 0, min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[j] > x) {
                return 1;
            }
            if (sum >= x) {
                min = Math.min(min, j - i + 1);
                sum -= arr[i];
                i++;
            }
            else {
                sum += arr[j];
                j++;
            }
        }

        if (sum > x) {
            min = Math.min(min, j - i + 1);
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public int minSubArrayLen(int x, int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[j] > x) {
                return 1;
            }
            if (sum > x) {
                min = Math.min(min, j - i + 1);
                sum -= nums[i];
                i++;
            }
            else {
                sum += nums[j];
                j++;
            }
        }

        if (sum > x) {
            min = Math.min(min, j - i + 1);
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
