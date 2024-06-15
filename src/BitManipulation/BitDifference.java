package BitManipulation;

public class BitDifference {

    public static int countBitsFlipBasic(int a, int b) {
        int count = 0;
        while (a != 0 || b != 0) {
            if (a % 2 != b % 2) {
                count++;
            }

            a /= 2;
            b /= 2;
        }

        return count;
    }

    public static int countBitsFlip(int a, int b) {
        int xor = a ^ b;
        return countOneBits(xor);
    }

    private static int countOneBits(final int xor) {
        if (xor == 0) {
            return 0;
        }

        return (xor & 1) + countOneBits(xor >> 1);
    }
}
