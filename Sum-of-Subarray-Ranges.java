1class Solution {
2
3    public long subArrayRanges(int[] nums) {
4
5        long ans = 0;
6
7        for (int i = 0; i < nums.length; i++) {
8
9            int min = nums[i];
10            int max = nums[i];
11
12            for (int j = i; j < nums.length; j++) {
13
14                min = Math.min(min, nums[j]);
15                max = Math.max(max, nums[j]);
16
17                ans += (max - min);
18            }
19        }
20
21        return ans;
22    }
23}