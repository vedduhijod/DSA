1class Solution {
2    public boolean check(int[] nums) {
3        int gCount = 0;
4        for(int i = 1; i < nums.length; i++){
5            if(nums[i - 1] > nums[i]){
6                gCount++;
7            }
8        }
9        if(nums[nums.length - 1] > nums[0]){
10            gCount++;
11        }
12        return gCount <= 1;
13
14    }
15}