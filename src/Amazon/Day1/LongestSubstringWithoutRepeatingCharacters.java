package Amazon.Day1;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 1;
        int left = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            max = Math.max(i-left, max);
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left++));
            }

            set.add(s.charAt(i));
        }

        return max;
    }
}
