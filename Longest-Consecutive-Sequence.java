1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        if (nums.length == 0) return 0;
6
7        Arrays.sort(nums);  // STEP 1: sort
8
9        int longest = 1;
10        int count = 1;
11
12        for (int i = 1; i < nums.length; i++) {
13
14            // skip duplicates
15            if (nums[i] == nums[i - 1]) {
16                continue;
17            }
18
19            // consecutive number
20            if (nums[i] == nums[i - 1] + 1) {
21                count++;
22            } 
23            // break in sequence
24            else {
25                longest = Math.max(longest, count);
26                count = 1;
27            }
28        }
29
30        return Math.max(longest, count);
31    }
32}
33