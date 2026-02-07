1class Solution {
2    public void sortColors(int[] nums) {
3        int zeros = 0;
4       int one = 0;
5       int two = 0;
6       int index = 0;
7
8    for(int num: nums){
9        if(num == 0) zeros++;
10        else if(num == 1) one++;
11        else two++;
12    }
13
14    while(zeros > 0){
15        nums[index] = 0;
16        index++;
17        zeros--;
18    }
19
20        while(one > 0){
21        nums[index] = 1;
22        index++;
23        one--;
24    }
25
26        while(two > 0){
27        nums[index] = 2;
28        index++;
29        two--;
30    }
31    
32    }
33}