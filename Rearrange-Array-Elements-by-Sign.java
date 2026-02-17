1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        int pos = 0;
7        int neg = 1;
8
9        for(int i = 0; i < n; i++){
10            if(nums[i] > 0){
11                ans[pos] = nums[i];
12                pos += 2;
13             }else{
14                ans[neg] = nums[i];
15                neg += 2;
16             }
17        }
18        return ans;
19    }
20}