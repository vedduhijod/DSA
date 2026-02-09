1class Solution {
2    public void rotate(int[] nums, int k) {
3        int len = nums.length;
4        int[] result = new int[len];
5
6        for(int i = 0; i < len; i++){
7            result[(i + k) % len] = nums[i];
8        }
9
10        for(int i = 0; i < len; i++){
11            nums[i] = result[i];
12        }
13    }
14}