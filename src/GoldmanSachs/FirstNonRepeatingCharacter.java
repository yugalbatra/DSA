package GoldmanSachs;

public class FirstNonRepeatingCharacter {

    static char nonRepeatingChar(String s) {
        int[] charArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charArray[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charArray[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '$';
    }

    static char nonRepeatingCharBool(String s) {
        Boolean[] charArray = new Boolean[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (charArray[index] == null) {
                charArray[index] = true;
            }
            else if (Boolean.TRUE.equals(charArray[index])) {
                charArray[index] = false;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (Boolean.TRUE.equals(charArray[s.charAt(i) - 'a'])) {
                return s.charAt(i);
            }
        }

        return '$';
    }
}
