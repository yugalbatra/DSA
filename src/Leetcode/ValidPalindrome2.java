package Leetcode;

public class ValidPalindrome2 {

    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1, true);
    }

    private boolean validPalindrome(String s, int i, int j, boolean can) {
        if (i >= j) return true;
        if (s.charAt(i) == s.charAt(j)) {
            return validPalindrome(s, i + 1, j - 1, can);
        }
        if (can) {
            return validPalindrome(s, i + 1, j, false) || validPalindrome(s, i, j - 1, false);
        }
        return false;
    }
}
