package String;

public class CountAndSay {

    public String countAndSay(int n, String ans) {
        if (n == 1) {
            return ans;
        }

        String mod = "";
        for (int i = 0; i < ans.length(); ) {
            int count = 0;
            char temp = ans.charAt(i);
            while (i < ans.length() && temp == ans.charAt(i)) {
                count++;
                i++;
            }

            mod = mod + count + temp;
        }

        return countAndSay(n - 1, mod);
    }

    public String countAndSay(int n) {
        return countAndSay(n, "1");
    }
}
