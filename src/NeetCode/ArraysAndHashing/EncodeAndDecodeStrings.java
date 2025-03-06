package NeetCode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        String ans = "";
        if (strs == null || strs.isEmpty()) return null;
        for (String s : strs) {
            ans += s + "𝔸";
        }

        return ans.substring(0, ans.length() - 2);
    }

    public List<String> decode(String str) {
        if (str == null) {
            return new ArrayList<>();
        }

        return List.of(str.split("𝔸"));
    }
}
