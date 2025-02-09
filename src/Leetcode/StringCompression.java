package Leetcode;

public class StringCompression {

    public String compressedString(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); ) {
            char ch = word.charAt(i);
            int j = 0;
            for (; j < 9 && i < word.length(); j++, i++) {
                if (word.charAt(i) != ch) {
                    break;
                }
            }

            stringBuilder.append(j).append(ch);
        }

        return stringBuilder.toString();
    }
}
