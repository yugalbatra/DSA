package Leetcode;

import java.util.Arrays;

public class NumberOfSegments {

    public int countSegments(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        boolean space = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!space && s.charAt(i) == ' ') {
                count++;
            }

            space = s.charAt(i) == ' ';
        }

        if (!space) {
            count++;
        }

        return count;
    }
}
