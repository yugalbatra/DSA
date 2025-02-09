package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set<Character> setJ = new HashSet<>();
        for (char j : J.toCharArray()) {
            setJ.add(j);
        }
        for (char s : S.toCharArray()) {
            if (setJ.contains(s)) {
                res++;
            }
        }
        return res;
    }

    public int numJewelsInStonesBasic(String jewels, String stones) {
        int ans = 0;
        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
