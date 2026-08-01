class Solution {
    public int maxProduct(int[] nums) {
        int min_ending = nums[0];
        int max_ending = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = nums[i];
            int v2 = min_ending * nums[i];
            int v3 = max_ending * nums[i];

            max_ending = Math.max(v1, Math.max(v2, v3));
            min_ending = Math.min(v1, Math.min(v2, v3));
            ans = Math.max(ans, Math.max(max_ending, min_ending));
        }
        return ans;
    }
}