class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        if(numbers.length == 0){
    return new int[]{-1, -1};
}

        while(i < j){
            int res = numbers[i] + numbers[j];
            if(res == target){
                return new int[]{i + 1, j + 1};
            }else if(res > target){
                j--;
            }else{
                i++;
            }
            res = numbers[i] + numbers[j];
        }
        return new int[]{-1, -1};
    }
}