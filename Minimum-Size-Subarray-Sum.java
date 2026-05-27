1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0;
4        int sum = 0;
5        int res = Integer.MAX_VALUE;
6        for(int right = 0; right < nums.length; right++){
7            sum += nums[right];
8            while(sum >= target){
9                int length = right - left + 1;
10                res = Math.min(res, length);
11                sum -= nums[left];
12                left++;
13            }
14        }
15
16        if(res == Integer.MAX_VALUE) return 0;
17
18        return res;
19    }
20}