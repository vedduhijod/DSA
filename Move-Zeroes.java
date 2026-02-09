1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != 0) {
6                int temp = nums[i];
7                nums[i] = nums[index];
8                nums[index] = temp;
9                index++;
10            }
11        }
12    }
13}
14