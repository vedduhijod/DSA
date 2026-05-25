class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int left = -1;
        int right = -1;

        int max = nums[0];
        int min = nums[n - 1];

        // Find right boundary
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);

            if (nums[i] < max) {
                right = i;
            }
        }

        // Find left boundary
        for (int i = n - 2; i >= 0; i--) {
            min = Math.min(min, nums[i]);

            if (nums[i] > min) {
                left = i;
            }
        }

        // Already sorted
        if (right == -1) {
            return 0;
        }

        return right - left + 1;
    }
}