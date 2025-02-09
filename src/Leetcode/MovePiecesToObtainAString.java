package Leetcode;

public class MovePiecesToObtainAString {

    public boolean canChange(String start, String target) {
        int i = 0, j = 0;
        while (i < start.length() && j < target.length()) {
            if (start.charAt(i) == '_') {
                i++;
            }
            else if (target.charAt(j) == '_') {
                j++;
            }
            else {
                if (start.charAt(i) != target.charAt(j)) {
                    return false;
                }
                if (start.charAt(i) == 'L' && i < j) {
                    return false;
                }
                if (start.charAt(i) == 'R' && i > j) {
                    return false;
                }
                i++;
                j++;
            }
        }

        while (i < start.length() && start.charAt(i) == '_') {
            i++;
        }
        while (j < target.length() && target.charAt(j) == '_') {
            j++;
        }

        return i == start.length() && j == target.length();
    }
}
