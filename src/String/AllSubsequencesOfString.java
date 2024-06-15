package String;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequencesOfString {

    private static final List<String> list = new ArrayList<>();

    public static void getAllSubsequences(String str, String ans) {
        if (str.isEmpty()) {
            list.add(ans);
            return;
        }

        getAllSubsequences(str.substring(1), ans + str.charAt(0));

        getAllSubsequences(str.substring(1), ans);
    }

    public static void main(String[] args) {
        getAllSubsequences("geeks", "");
        System.out.println(list);
    }
}
