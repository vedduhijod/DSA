1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k <= 1) return 0;
4        int left = 0;
5        int count = 0;
6        int product = 1;
7
8        for(int right = 0; right < nums.length; right++){
9            product *= nums[right];
10
11            while(product >= k){
12                product /= nums[left];
13                left++;
14            }
15            count += (right - left + 1);
16        }
17        return count;
18    }
19}