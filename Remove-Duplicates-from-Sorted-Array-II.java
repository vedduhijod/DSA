1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int index = 1;
4        int occur = 1;
5        for(int i = 1; i < nums.length; i++){
6            if(nums[i] == nums[i-1]){
7                occur++;    
8            }else{
9                occur = 1;
10            }
11            if(occur <= 2){
12                nums[index] = nums[i];
13                index++;
14            }
15        }
16        return index;
17    }
18}