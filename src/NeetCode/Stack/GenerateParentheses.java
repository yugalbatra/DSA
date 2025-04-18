package Neetcode.Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, n, 0, 0, "");
        return ans;
    }

    public void helper(List<String> list, int n, int left, int right, String s) {
        if (left == n && right == n) {
            list.add(s);
            return;
        }

        if (left < n) {
            helper(list, n, left + 1, right, s + "(");
        }

        if (right < left) {
            helper(list, n, left, right + 1, s + ")");
        }
    }
}
