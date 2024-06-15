package String;

import java.util.*;

public class AllPermutationsOfAString {

    Set<String> set = new HashSet<>();

    public void addPermutation(String s, String ans) {
        if (s.isEmpty()) {
            set.add(ans);
            return;
        }

        for (int i = 0; i <= ans.length(); i++) {
            addPermutation(s.substring(1), ans.substring(0, i) + s.charAt(0) + ans.substring(i));
        }
    }

    public List<String> find_permutation(String S) {
        addPermutation(S, "");
        final var list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}

