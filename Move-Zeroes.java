1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index =0;
4        for(int i = 0; i < nums.length; i++){
5            if(nums[i] != 0){
6                nums[index] = nums[i];
7                index++;
8            }
9        }
10
11        for(int i = index; i < nums.length; i++){
12            nums[i] = 0;
13            
14        }
15
16    }
17}