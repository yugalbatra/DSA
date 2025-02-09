package Leetcode;

public class SumOfSquareNumbers {
    public boolean judgeSquareSumBasic(int c) {
        for (int a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }

        return false;
    }

    public boolean judgeSquareSum(int c) {
        long a = 0, b = (long) Math.sqrt(c);
        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c) return true;
            if (sum < c) a++;
            else b--;
        }

        return false;
    }
}
