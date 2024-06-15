package Array;

public class MinimumJumps {

    public static int minimumJumps(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        if (nums[0] == 0) {
            return -1;
        }
        int count = 1;
        int max = nums[0], maxIndex = 0;
        for (int i = 1; i < nums.length;) {
            if (nums[i] == 0) return -1;
            if (max >= nums.length - 1) {
                return count;
            }

            for (int j = i; j <= max && j < nums.length; j++) {
                if (j + nums[j] > max) {
                    max = j + nums[j];
                    i = j;
                }
            }

            count++;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minimumJumps(new int[] { 1, 2, 3 }));
    }
}
