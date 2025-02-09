package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : licensePlate.toCharArray()) {
            if (ch == ' ' || (ch >= '0' && ch <= '9')) {
                continue;
            }

            ch = Character.toLowerCase(ch);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String ans = "";
        for (String str : words) {
            if (!ans.isEmpty() && str.length() > ans.length()) {
                continue;
            }

            final var temp = new HashMap<>(map);
            for (char ch : str.toCharArray()) {
                if (temp.containsKey(ch)) {
                    temp.put(ch, temp.get(ch) - 1);
                }
            }

            boolean completingWord = true;
            for (final var key : temp.keySet()) {
                if (temp.get(key) > 0) {
                    completingWord = false;
                    break;
                }
            }

            if (completingWord) {
                ans = str;
            }
        }

        return ans;
    }
}
