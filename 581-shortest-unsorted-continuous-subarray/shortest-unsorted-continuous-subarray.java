class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n - 1;

        // Find first disorder from left
        while (left < n - 1 && nums[left] <= nums[left + 1]) {
            left++;
        }

        // Already sorted
        if (left == n - 1) {
            return 0;
        }

        // Find first disorder from right
        while (right > 0 && nums[right] >= nums[right - 1]) {
            right--;
        }

        // Find min and max inside unsorted part
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = left; i <= right; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Extend left if needed
        while (left > 0 && nums[left - 1] > min) {
            left--;
        }

        // Extend right if needed
        while (right < n - 1 && nums[right + 1] < max) {
            right++;
        }

        return right - left + 1;
    }
}