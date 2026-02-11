class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            int firstel = nums[j];
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] == firstel) {
                    cnt++;
                }
            }

            if (cnt > n / 2) {
                return firstel;
            }
        }

        return -1; // majority element always exists per problem statement
    }
}
