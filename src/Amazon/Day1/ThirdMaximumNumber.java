package Amazon.Day1;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        Integer max = null, secondMax = null, thirdMax = null;
        for (final int num : nums) {
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            }
            else if ((secondMax == null || num > secondMax) && num < max) {
                thirdMax = secondMax;
                secondMax = num;
            }
            else if ((thirdMax == null || num > thirdMax) && secondMax != null && num < secondMax) {
                thirdMax = num;
            }
        }

        return thirdMax == null ? max : thirdMax;
    }
}
