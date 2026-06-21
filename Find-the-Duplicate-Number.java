1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = nums[0];
4int fast = nums[0];
5
6while (true) {
7    slow = nums[slow];
8    fast = nums[nums[fast]];
9
10    if (slow == fast) {
11        slow = nums[0];
12
13        while (slow != fast) {
14            slow = nums[slow];
15            fast = nums[fast];
16        }
17
18        return slow;
19    }
20}
21    }
22}