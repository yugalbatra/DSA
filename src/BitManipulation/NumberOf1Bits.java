package BitManipulation;

public class NumberOf1Bits {

    static int setBitsDivide(int N) {
        if (N == 0) {
            return 0;
        }

        return N % 2 == 0 ? setBitsDivide(N / 2) : 1 + setBitsDivide(N / 2);
    }

    static int setBits(int N) {
        if (N == 0) {
            return 0;
        }

        return (N & 1) + setBits(N >> 1);
    }
}
