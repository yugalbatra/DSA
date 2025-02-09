package Leetcode;

public class DetectCapital {

    public boolean isUpper(String str) {
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return false;
            }
        }

        return true;
    }

    public boolean isLower(String str) {
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return false;
            }
        }

        return true;
    }

    public boolean detectCapitalUse(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))) {
                return isUpper(word.substring(2));
            }
            else {
                return isLower(word.substring(2));
            }
        }
        else {
            return isLower(word.substring(1));
        }
    }
}
