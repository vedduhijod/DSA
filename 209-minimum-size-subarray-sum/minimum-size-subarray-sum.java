class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int r=0; r<nums.length; r++){
            sum = sum + nums[r];
            while(sum >= target){
                int len = r - l + 1;
                ans = Math.min(ans, len);
                sum = sum - nums[l];
                l++;
            }
        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}