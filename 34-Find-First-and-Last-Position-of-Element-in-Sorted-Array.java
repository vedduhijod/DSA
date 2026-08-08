class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }
        private int findFirst(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int guess = (low + high) / 2;

            if (nums[guess] < target) {
                low = guess + 1;
            } else if (nums[guess] > target) {
                high = guess - 1;
            } else {
                result = guess;
                high = guess - 1; // keep searching left
            }
        }

        return result;
    }
        private int findLast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int guess = (low + high) / 2;

            if (nums[guess] < target) {
                low = guess + 1;
            } else if (nums[guess] > target) {
                high = guess - 1;
            } else {
                result = guess;
                low = guess + 1; // keep searching right
            }
        }

        return result;
    }
}
    
