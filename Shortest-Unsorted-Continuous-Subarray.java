1class Solution {
2    public int findUnsortedSubarray(int[] nums) {
3        int n = nums.length;
4
5        int left = -1;
6        int right = -1;
7
8        int max = nums[0];
9        int min = nums[n - 1];
10
11        // Find right boundary
12        for (int i = 1; i < n; i++) {
13            max = Math.max(max, nums[i]);
14
15            if (nums[i] < max) {
16                right = i;
17            }
18        }
19
20        // Find left boundary
21        for (int i = n - 2; i >= 0; i--) {
22            min = Math.min(min, nums[i]);
23
24            if (nums[i] > min) {
25                left = i;
26            }
27        }
28
29        // Already sorted
30        if (right == -1) {
31            return 0;
32        }
33
34        return right - left + 1;
35    }
36}