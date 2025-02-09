package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SubsequeneUsingCyclicIncrements {

    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        for (char ch : str1.toCharArray()) {
            char updatedChar = ch == 'z' ? 'a' : (char) (ch + 1);
            if (i == str2.length()) {
                return true;
            }
            if (str2.charAt(i) == ch || str2.charAt(i) == updatedChar) {
                i++;
            }
        }

        return i == str2.length();
    }
}
