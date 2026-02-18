1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        HashSet<Integer> set = new HashSet<>();
6
7        // put all elements into set
8        for (int num : nums) {
9            set.add(num);
10        }
11
12        int longest = 0;
13
14        for (int num : set) {
15
16            // start only if num is the beginning
17            if (!set.contains(num - 1)) {
18
19                int curr = num;
20                int count = 1;
21
22                // count consecutive numbers
23                while (set.contains(curr + 1)) {
24                    curr++;
25                    count++;
26                }
27
28                longest = Math.max(longest, count);
29            }
30        }
31        return longest;
32    }
33}
34