package Amazon.Day1;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelfBruteforce(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int pro = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                pro *= nums[j];
            }

            ans[i] = pro;
        }

        return ans;
    }

    public int[] productExceptSelfOptimized(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] *= product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= product;
            product *= nums[i];
        }

        return ans;
    }
}
