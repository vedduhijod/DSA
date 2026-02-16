1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum = 0;
4        int max = Integer.MIN_VALUE;
5
6        for(int i = 0; i < nums.length; i++){
7            sum += nums[i];
8
9            if(sum > max){
10                max = sum;
11            }
12
13            if(sum < 0){
14                sum = 0;
15            }
16        }
17        return max;
18    }
19}