package String;

public class RotatedString {

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenate = s1 + s2;
        return concatenate.contains(s2);
    }
}
