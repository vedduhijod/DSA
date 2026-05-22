1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int right = n -1;
6        int index = n - 1;
7        int[] res = new int[n];
8
9        while(left <= right){
10            int leftsquare = nums[left] * nums[left];
11            int rightsquare = nums[right] * nums[right];
12            if(leftsquare > rightsquare){
13                res[index] = leftsquare;
14                left++;
15            }else{
16                res[index] = rightsquare;
17                right--;
18            }
19            index--;
20        }
21        return res;
22    }
23}