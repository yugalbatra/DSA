package String;

public class LongestPalindromeInString {

    static String palindrome(String S, int l, int r) {
        String max = "";
        if (l == -1 || r == S.length()) {
            return max;
        }

        while (S.charAt(l) == S.charAt(r)) {
            max = S.substring(l, r + 1);
            l--;
            r++;
            if (l == -1 || r == S.length()) {
                break;
            }
        }

        return max;
    }

    static String longestPalin(String S) {
        String maxPalin = String.valueOf(S.charAt(0));
        for (int i = 0; i < S.length(); i++) {
            String str;

            str = palindrome(S, i, i + 1);
            if (str.length() > maxPalin.length()) {
                maxPalin = str;
            }
            str = palindrome(S, i, i);

            if (str.length() > maxPalin.length()) {
                maxPalin = str;
            }
        }

        return maxPalin;
    }
}
