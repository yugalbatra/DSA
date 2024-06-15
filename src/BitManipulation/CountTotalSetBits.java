package BitManipulation;

public class CountTotalSetBits {

    public static int countSetBits(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 1;
        int i = 2;
        for (; i < n; i *= 2) {
            count += (i * 2 - i) + count;
        }

        i /= 2;
        return count;
    }
}
