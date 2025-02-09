package Leetcode;

import java.util.Arrays;

public class LicenceKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-","").toUpperCase();
        for (int i = s.length() - k; i > 0; i -= k) {
            s = s.substring(0, i) + "-" + s.substring(i);
        }

        return s;
    }
}
