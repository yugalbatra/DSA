package Leetcode;

public class BinaryNumberWithAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        boolean last = (n & 1) == 0;
        n >>= 1;
        while (n != 0) {
            if (last == ((n & 1) == 0)) return false;
            last = (n & 1) == 0;
            n >>= 1;
        }

        return true;
    }
}
