1import java.util.HashMap;
2
3class Solution {
4    public int majorityElement(int[] nums) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        int n = nums.length;
7
8        // count frequency
9        for (int num : nums) {
10            map.put(num, map.getOrDefault(num, 0) + 1);
11        }
12
13        // find majority
14        for (int key : map.keySet()) {
15            if (map.get(key) > n / 2) {
16                return key;
17            }
18        }
19
20        return -1;
21    }
22}
23