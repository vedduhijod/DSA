import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);  // STEP 1: sort

        int longest = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            // skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // consecutive number
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } 
            // break in sequence
            else {
                longest = Math.max(longest, count);
                count = 1;
            }
        }

        return Math.max(longest, count);
    }
}
