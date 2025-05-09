package BitManipulation;

public class PowerOfTwo {

    public static boolean isPowerofTwo(long n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
