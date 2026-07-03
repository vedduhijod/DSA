class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefix = 0;
        int minPrefix = 0;
        int maxPrefix = 0;

        for (int num : nums) {
            prefix += num;
            minPrefix = Math.min(minPrefix, prefix);
            maxPrefix = Math.max(maxPrefix, prefix);
        }

        return maxPrefix - minPrefix;
    }
}