package Leetcode;

public class AddingSpacesToAString {

    public String addSpaces(String s, int[] spaces) {
        char[] ans = new char[s.length() + spaces.length];
        int j = 0, k = 0;
        for (int i = 0; i < ans.length; i++) {
            if (k < spaces.length && spaces[k] == j) {
                ans[i++] = ' ';
                k++;
            }

            ans[i] = s.charAt(j++);
        }

        return String.valueOf(ans);
    }
}
