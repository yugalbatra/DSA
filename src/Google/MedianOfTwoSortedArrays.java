package Google;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int half = (nums1.length + nums2.length + 1) / 2;
        int start = 0, end = nums1.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            int l1 = mid == 0 ? Integer.MIN_VALUE : nums1[mid - 1];
            int l2 = mid == nums1.length ? Integer.MAX_VALUE : nums1[mid];
            int r1 = half - mid == 0 ? Integer.MIN_VALUE : nums2[half - mid - 1];
            int r2 = half - mid == nums2.length ? Integer.MAX_VALUE : nums2[half - mid];
            if (r1 <= l2 && r2 >= l1) {
                return (nums1.length + nums2.length) % 2 != 0
                        ? Math.max(l1, r1)
                        : (Math.max(l1, r1) + Math.min(r2, l2)) / 2.0;
            }
            if (l1 < r2) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0;
    }
}
