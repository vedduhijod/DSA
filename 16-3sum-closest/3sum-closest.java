class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate starting values
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Minimum possible sum with current i
            int minSum = nums[i] + nums[i + 1] + nums[i + 2];
            if (minSum > target) {
                if (Math.abs(minSum - target) < Math.abs(closest - target))
                    closest = minSum;
                break;
            }

            // Maximum possible sum with current i
            int maxSum = nums[i] + nums[n - 2] + nums[n - 1];
            if (maxSum < target) {
                if (Math.abs(maxSum - target) < Math.abs(closest - target))
                    closest = maxSum;
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(closest - target))
                    closest = sum;

                if (sum == target)
                    return target;

                if (sum < target)
                    left++;
                else
                    right--;
            }
        }

        return closest;
    }
}