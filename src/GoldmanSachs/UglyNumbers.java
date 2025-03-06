package GoldmanSachs;

public class UglyNumbers {

    public static int uglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int nextUglyNumber;
        int i2 = 0, i3 = 0, i5 = 0;
        int nextMultipleOf2 = 2, nextMultipleOf3 = 3, nextMultipleOf5 = 5;
        for (int i = 1; i < n; i++) {
            nextUglyNumber = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
            uglyNumbers[i] = nextUglyNumber;
            if (nextUglyNumber == nextMultipleOf2) {
                nextMultipleOf2 = uglyNumbers[++i2] * 2;
            }
            if (nextUglyNumber == nextMultipleOf3) {
                nextMultipleOf3 = uglyNumbers[++i3] * 3;
            }
            if (nextUglyNumber == nextMultipleOf5) {
                nextMultipleOf5 = uglyNumbers[++i5] * 5;
            }
        }

        return uglyNumbers[n - 1];
    }
}
