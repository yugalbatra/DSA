package BitManipulation;

public class NonRepeatingNumber {

    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n : nums) {
            xor ^= n;
        }
        int rightBit = xor & -xor;
        int x = 0, y = 0;
        for (int n : nums) {
            if ((n & rightBit) == 0) {
                x ^= n;
            }
            else {
                y ^= n;
            }
        }

        return x > y ? new int[] { y, x } : new int[] { x, y };
    }
}
