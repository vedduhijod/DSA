class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j ++){
                if(nums[i] == nums[j] && nums[i] != -1 && i != j){
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
            if(nums[i] != -1) return nums[i];
        }
        return -1;
    }
}