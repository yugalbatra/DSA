package Leetcode;

public class SeparateBlackAndWhiteBalls {

    public long minimumSteps(String s) {
        int countBlack = 0;
        long swaps = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                swaps += countBlack;
            }
            else {
                countBlack++;
            }
        }

        return swaps;
    }
}
