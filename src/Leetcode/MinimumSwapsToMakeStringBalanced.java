package Leetcode;

import java.util.Stack;

public class MinimumSwapsToMakeStringBalanced {

    public int minSwaps(String s) {
        int count = 0;
        int countBracket = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                countBracket++;
            }
            else {
                if (countBracket == 0) {
                    countBracket++;
                    count++;
                }
                else {
                    countBracket--;
                }
            }
        }

        return (countBracket / 2 + count) / 2;
    }

    public static void main(String[] args) {
        new MinimumSwapsToMakeStringBalanced().minSwaps("]]][[[");
    }
}
