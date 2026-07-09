import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;
        
        // prefix sum 0 occurs before array starts
        map.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                // store first occurrence only
                map.put(sum, i);
            }
        }
        
        return maxLen;
    }
}