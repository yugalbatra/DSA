package Leetcode;

public class CountPrimeSetBits {

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int bits = 0, temp = i;
            while (temp != 0) {
                if ((temp & 1) == 1) {
                    bits++;
                }
                temp >>= 1;
            }
            if (prime(bits)) {
                count++;
            }
        }

        return count;
    }

    private boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
