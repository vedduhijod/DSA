import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int res = 0;

        HashMap<Integer, Integer> firstIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zero++;
            else one++;

            int diff = zero - one;

            // If diff is 0, subarray from 0 to i has equal 0s and 1s
            if (diff == 0) {
                res = Math.max(res, i + 1);
            } 
            // If we've seen this diff before, subarray between previous index+1 and i is balanced
            else if (firstIndex.containsKey(diff)) {
                int idx = firstIndex.get(diff);
                int len = i - idx;
                res = Math.max(res, len);
            } 
            // Store first occurrence of this diff
            else {
                firstIndex.put(diff, i);
            }
        }

        return res;
    }
}