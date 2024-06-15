package Array;

public class PalindromicArray {

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = temp % 10;
        temp /= 10;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static int palinArray(int[] a, int n) {
        for (int i : a) {
            if (!isPalindrome(i)) {
                return 0;
            }
        }

        return 1;
    }
}
