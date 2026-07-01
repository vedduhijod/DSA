1class Solution {
2    public int maxSubArray(int[] nums) {
3        int best_ending = nums[0];
4        int ans = nums[0];
5
6        for(int i = 1; i < nums.length; i++){
7            int one = best_ending + nums[i];
8            int two = nums[i];
9            
10            best_ending = Math.max(one, two);
11            ans = Math.max(ans, best_ending);
12        }
13        return ans;
14    }
15}