package Leetcode;

import java.util.Objects;

public class LongestHappyString {

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder builder = new StringBuilder();
        while (a != 0 || b != 0 || c != 0) {
            if (a >= b && a >= c) {
                if (builder.length() >= 2 && !Objects.equals(builder.substring(builder.length() - 3), "aa")) {
                    builder.append('a');
                    a--;
                }
                else if (b >= c && b > 0) {
                    builder.append('b');
                    b--;
                } else if (c > 0) {
                    builder.append('c');
                    c--;
                }
            }
            else if (b >= c) {
                if (builder.length() >= 2 && !Objects.equals(builder.substring(builder.length() - 3), "bb")) {
                    builder.append('b');
                    b--;
                }
                else if (a >= c && a > 0) {
                    builder.append('a');
                    a--;
                }
                else if (c > 0) {
                    builder.append('c');
                    c--;
                } else {
                    break;
                }
            }
            else {
                if (builder.length() >= 2 && !Objects.equals(builder.substring(builder.length() - 3), "cc")) {
                    builder.append('c');
                    c--;
                }
                else if (a>=b && a > 0) {
                    builder.append('a');
                    a--;
                }
                else if (b > 0) {
                    builder.append('b');
                    b--;
                } else {
                    break;
                }
            }
        }

        return builder.toString();
    }
}
