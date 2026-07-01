1class Solution {
2    public int maxProduct(int[] nums) {
3        int min_endings = nums[0];
4        int max_endings = nums[0];
5        int ans = nums[0];
6
7        for(int i = 1; i < nums.length; i++){
8            int v1 = nums[i];
9            int v2 = min_endings * nums[i];
10            int v3 = max_endings * nums[i];
11
12            max_endings = Math.max(v1, Math.max(v2, v3));
13            min_endings = Math.min(v1, Math.min(v2, v3));
14
15            ans = Math.max(ans, Math.max(max_endings, min_endings));
16        }
17        return ans;
18    }
19}