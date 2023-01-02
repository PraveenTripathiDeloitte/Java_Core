package practice;

import java.util.Arrays;

public class Solution {

    public boolean binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        Solution solution = new Solution();
        int low = 0, high = nums.length - 1, N = nums.length - 1;
        boolean flag = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[(mid + N - 1) % N] && nums[mid] < nums[(mid + 1) % N]) {
                flag = solution.binarySearch(Arrays.copyOfRange(nums, 0, mid - 1), target) || solution.binarySearch(Arrays.copyOfRange(nums, mid, N - 1), target);
                return flag;
            } else if (nums[mid] > nums[N - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 0, 1, 1, 1};
        System.out.println(solution.search(arr, 0));
    }
}
