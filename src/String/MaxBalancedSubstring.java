package String;

public class MaxBalancedSubstring {

    public static int maxSubStr(String str) {
        int count = 0, countSubstring = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                count--;
            }
            else {
                count++;
            }
            if (count == 0) {
                countSubstring++;
            }
        }

        return count != 0 ? -1 : countSubstring;
    }
}
