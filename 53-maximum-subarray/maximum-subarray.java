class Solution {
    public int maxSubArray(int[] nums) {
        int best_ending = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int one = best_ending + nums[i];
            int two = nums[i];
            
            best_ending = Math.max(one, two);
            ans = Math.max(ans, best_ending);
        }
        return ans;
    }
}