1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4
5        int minDiff = Integer.MAX_VALUE;
6        int ans = 0;
7
8        for (int i = 0; i < nums.length - 2; i++) {
9
10            // Skip duplicate starting elements
11            if (i > 0 && nums[i] == nums[i - 1])
12                continue;
13
14            int left = i + 1;
15            int right = nums.length - 1;
16
17            while (left < right) {
18
19                int sum = nums[i] + nums[left] + nums[right];
20                int diff = Math.abs(sum - target);
21
22                if (diff < minDiff) {
23                    minDiff = diff;
24                    ans = sum;
25                }
26
27                if (sum == target)
28                    return target;
29
30                else if (sum < target)
31                    left++;
32
33                else
34                    right--;
35            }
36        }
37
38        return ans;
39    }
40}