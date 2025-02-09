package Leetcode;

public class PrimeSubtractionOperation {

    public boolean primeSubOperation(int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            int primeSub = calculatePrimeOperation(nums[i], min);
            if (primeSub > min) {
                nums[i] = primeSub;
            }

            if (nums[i] <= min) {
                return false;
            }

            min = nums[i];
        }

        return true;
    }

    private int calculatePrimeOperation(final int num, final int min) {
        if (num <= 2) {
            return num;
        }

        int temp = num - min;
        while (!isPrime(--temp)) {
        }

        return num - temp;
    }

    private boolean isPrime(final int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeSubtractionOperation().primeSubOperation(new int[] { 15, 20, 17, 7, 16 }));
    }
}
