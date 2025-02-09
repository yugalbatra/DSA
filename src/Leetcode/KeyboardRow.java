package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

    private static final String FIRST_ROW = "qwertyuiop";

    private static final String SECOND_ROW = "asdfghjkl";

    private static final String THIRD_ROW = "zxcvbnm";

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String s : words) {
            if (s.isEmpty()) {
                continue;
            }
            if (check(s)) {
                list.add(s);
            }
        }

        return list.toArray(new String[0]);
    }

    private boolean check(String str) {
        String stringLine;
        if (FIRST_ROW.indexOf(Character.toLowerCase(str.charAt(0))) != -1) {
            stringLine = FIRST_ROW;
        }
        else if (SECOND_ROW.indexOf(Character.toLowerCase(str.charAt(0))) != -1) {
            stringLine = SECOND_ROW;
        }
        else {
            stringLine = THIRD_ROW;
        }
        for (char ch : str.toCharArray()) {
            if (stringLine.indexOf(Character.toLowerCase(ch)) == -1) {
                return false;
            }
        }

        return true;
    }
}
