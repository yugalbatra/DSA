package Leetcode;

public class MinimumSwapsToGroupAllOneTogeteher {

    public int minSwaps(int[] nums) {
        int countOnes = 0;
        for (int i : nums) {
            if (i == 1) {
                countOnes++;
            }
        }
        int count = 0;
        for (int i = 0; i < countOnes; i++) {
            if (nums[i] == 1) {
                count++;
            }
        }
        int max = count;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && nums[(i + countOnes) % nums.length] == 0) {
                count--;
            }
            if (nums[i] == 0 && nums[(i + countOnes) % nums.length] == 1) {
                count++;
            }
            max = Math.max(max, count);
        }

        return countOnes - max;
    }

    public static void main(String[] args) {
        new MinimumSwapsToGroupAllOneTogeteher().minSwaps(new int[] { 0, 1, 1, 1, 0, 0, 1, 1, 0 });
    }
}
