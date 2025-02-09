package Leetcode;

public class ReverseStringII {

    public void reverseString(char[] s, int i, int j) {
        while (i < j) {
            s[i] = (char) (s[i] ^ s[j] ^ (s[j--] = s[i++]));
        }
    }

    public String reverseStr(String s, int k) {
        char[] chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; i += 2 * k) {
            if (i + k - 1 < chArr.length) {
                reverseString(chArr, i, i + k - 1);
            }
            else {
                reverseString(chArr, i, chArr.length - 1);
            }
        }

        return String.valueOf(chArr);
    }
}
