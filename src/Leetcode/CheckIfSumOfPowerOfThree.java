package Leetcode;

import java.util.Map;

public class CheckIfSumOfPowerOfThree {

    public boolean checkPowersOfThree(int n) {
        if (n <= 0) return false;
        int pow = 0;
        while (n >= Math.pow(3, pow)) {
            pow++;
        }
        pow--;
        while (n > 0 && pow >= 0) {
            if (n >= Math.pow(3, pow)) {
                n -= (int) Math.pow(3, pow);
            }
            pow--;
        }

        return n == 0;
    }
}
