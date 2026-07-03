class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = maxSubarray(nums);
        int minSum = minSubarray(nums);
        
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }

    private int maxSubarray(int[] nums) {
        int bestEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            bestEnding = Math.max(bestEnding + nums[i], nums[i]);
            ans = Math.max(ans, bestEnding);
        }

        return ans;
    }

    private int minSubarray(int[] nums) {
        int bestEnding = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            bestEnding = Math.min(bestEnding + nums[i], nums[i]);
            ans = Math.min(ans, bestEnding);
        }

        return ans;
    }
}