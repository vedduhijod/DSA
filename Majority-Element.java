1class Solution {
2    public int majorityElement(int[] nums) {
3        int n = nums.length;
4
5        for (int j = 0; j < n; j++) {
6            int firstel = nums[j];
7            int cnt = 0;
8
9            for (int i = 0; i < n; i++) {
10                if (nums[i] == firstel) {
11                    cnt++;
12                }
13            }
14
15            if (cnt > n / 2) {
16                return firstel;
17            }
18        }
19
20        return -1; // majority element always exists per problem statement
21    }
22}
23