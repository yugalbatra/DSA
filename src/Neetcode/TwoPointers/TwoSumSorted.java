package Neetcode.TwoPointers;

public class TwoSumSorted {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            }

            if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return null;
    }
}
