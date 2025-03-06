package NeetCode.ArraysAndHashing;


import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagramsBasic(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] found = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (found[i]) continue;
            List<String> anagrams = new ArrayList<>();
            anagrams.add(strs[i]);
            found[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (!found[j] && isAnagram(strs[i], strs[j])) {
                    found[j] = true;
                    anagrams.add(strs[j]);
                }
            }
            ans.add(anagrams);
        }

        return ans;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charsCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charsCount[s.charAt(i) - 'a']++;
            charsCount[t.charAt(i) - 'a']--;
        }

        for (int i : charsCount) {
            if (i != 0) return false;
        }

        return true;
    }
}
