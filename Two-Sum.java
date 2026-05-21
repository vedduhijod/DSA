1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for(int i = 0; i < nums.length; i++){
6            int sum = target - nums[i];
7            if(map.containsKey(sum)){
8                return new int[]{map.get(sum), i};
9            }
10            map.put(nums[i], i);
11        }
12        return new int[]{};
13    }
14}