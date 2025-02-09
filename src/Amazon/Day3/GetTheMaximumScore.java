package Amazon.Day3;

import Leetcode.WordOccursAsPrefic;

public class GetTheMaximumScore {
    public static void main(String[] args) {
        WordOccursAsPrefic w = new WordOccursAsPrefic();
//        w.isPrefixOfWord("","");
    }

    public int maxSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int mod = 1_000_000_007, i = 0, j = 0, m = nums1.length, n = nums2.length;
        while (i < m || j < n) {
            if (i < m && (j == n || nums1[i] < nums2[j])) {
                sum1 += nums1[i++];
            }
            else if (i == m || nums2[j] < nums1[i]) {
                sum2 += nums2[j++];
            }
            else {
                sum1 = sum2 = Math.max(sum1, sum2) + nums1[i];
                i++;
                j++;
            }
        }
        return (int) (Math.max(sum1, sum2) % mod);
    }

    public int maxSumNotOptimized(int[] nums1, int[] nums2) {
        return Math.max(maxSum(nums1, nums2, 0, 0, true), maxSum(nums1, nums2, 0, 0, false));
    }

    private int maxSum(int[] nums1, int[] nums2, int i, int j, boolean firstArray) {
        if (firstArray) {
            if (i >= nums1.length) {
                return 0;
            }

            while (j < nums2.length && nums2[j] < nums1[i]) {
                j++;
            }

            if (j < nums2.length && nums1[i] == nums2[j]) {
                return nums1[i] + Math.max(maxSum(nums1, nums2, i + 1, j + 1, true)
                    , maxSum(nums1, nums2, i + 1, j + 1, false));
            }

            return nums1[i] + maxSum(nums1, nums2, i + 1, j, true);
        }
        else {
            if (j >= nums2.length) {
                return 0;
            }

            while (i < nums1.length && nums1[i] < nums2[j]) {
                i++;
            }

            if (i < nums1.length && nums1[i] == nums2[j]) {
                return nums1[i] + Math.max(maxSum(nums1, nums2, i + 1, j + 1, true)
                    , maxSum(nums1, nums2, i + 1, j + 1, false));
            }

            return nums2[j] + maxSum(nums1, nums2, i, j + 1, false);
        }
    }

}
