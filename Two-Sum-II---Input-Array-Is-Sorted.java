1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int low = 0;
4        int high = numbers.length - 1;
5        while(low < high){
6            int sum = numbers[low] + numbers[high];
7            if(sum == target){
8                return new int[]{low + 1, high + 1};
9            }else if(sum < target){
10                low++;
11            }else{
12                high--;
13            }
14        }
15        return new int[]{-1, -1};
16    }
17}