import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // put all elements into set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // start only if num is the beginning
            if (!set.contains(num - 1)) {

                int curr = num;
                int count = 1;

                // count consecutive numbers
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
