package Neetcode.TwoPointers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
//        s = s.toLowerCase()
//             .chars()
//             .filter(Character::isLetterOrDigit)
//             .mapToObj(x -> String.valueOf((char) x))
//             .collect(Collectors.joining());
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
