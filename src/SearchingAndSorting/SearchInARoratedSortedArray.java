package SearchingAndSorting;

public class SearchInARoratedSortedArray {

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                if (nums[mid] > nums[end] && nums[end] >= target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (nums[mid] < nums[start] && nums[start] <= target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInARoratedSortedArray().search(new int[]{4,5,6,7,0,1,2}, 4));
    }
}
