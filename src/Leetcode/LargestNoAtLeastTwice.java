package Leetcode;

public class LargestNoAtLeastTwice {

    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, maxIndex = -1;
        int i = 0;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
                maxIndex = i;
            }
            else if (num > secondMax) {
                secondMax = num;
            }
            i++;
        }

        return max >= secondMax * 2 ? maxIndex : -1;
    }
}
