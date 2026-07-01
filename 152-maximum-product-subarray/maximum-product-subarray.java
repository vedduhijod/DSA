class Solution {
    public int maxProduct(int[] nums) {
        int min_endings = nums[0];
        int max_endings = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int v1 = nums[i];
            int v2 = min_endings * nums[i];
            int v3 = max_endings * nums[i];

            max_endings = Math.max(v1, Math.max(v2, v3));
            min_endings = Math.min(v1, Math.min(v2, v3));

            ans = Math.max(ans, Math.max(max_endings, min_endings));
        }
        return ans;
    }
}