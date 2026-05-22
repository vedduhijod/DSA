class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n -1;
        int index = n - 1;
        int[] res = new int[n];

        while(left <= right){
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];
            if(leftsquare > rightsquare){
                res[index] = leftsquare;
                left++;
            }else{
                res[index] = rightsquare;
                right--;
            }
            index--;
        }
        return res;
    }
}