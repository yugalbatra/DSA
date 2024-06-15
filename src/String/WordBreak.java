package String;

import java.util.ArrayList;

public class WordBreak {

    public static int wordBreak(int n, String s, ArrayList<String> dictionary, int i, boolean[] visited) {
        if (i == n) {
            return 0;
        }
        if (s.isEmpty()) {
            return 1;
        }

        if (!visited[i] && s.contains(dictionary.get(i))) {
            visited[i] = true;
            if (wordBreak(n, s.replace(dictionary.get(i), ""), dictionary, i + 1, visited) == 1) {
                return 1;
            }
            visited[i] = false;
        }
        if (wordBreak(n, s, dictionary, i + 1, visited) == 1) {
            return 1;
        }

        return 0;
    }

    public static int wordBreak(int n, String s, ArrayList<String> dictionary) {
        return wordBreak(n, s, dictionary, 0, new boolean[dictionary.size()]);
    }
}
