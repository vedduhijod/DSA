class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
       int one = 0;
       int two = 0;
       int index = 0;

    for(int num: nums){
        if(num == 0) zeros++;
        else if(num == 1) one++;
        else two++;
    }

    while(zeros > 0){
        nums[index] = 0;
        index++;
        zeros--;
    }

        while(one > 0){
        nums[index] = 1;
        index++;
        one--;
    }

        while(two > 0){
        nums[index] = 2;
        index++;
        two--;
    }
    
    }
}