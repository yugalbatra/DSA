package Amazon.Day4;

import java.util.ArrayList;
import java.util.List;

public class GeneateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, 0, 0, "", n);
        return ans;
    }
    private void helper(final List<String> ans, final int open, final int close, final String str, final int n) {
        if (str.length() == n * 2) {
            ans.add(str);
            return;
        }

        if (open < n) {
            helper(ans, open + 1, close, str + '(', n);
        }

        if (close < open) {
            helper(ans, open, close + 1, str + ')', n);
        }
    }
}
