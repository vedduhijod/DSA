class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int[] temp = nums.clone();
        Arrays.sort(temp);

        int left = 0;
        int right = n - 1;

        while (left < n && nums[left] == temp[left]) {
            left++;
        }

        while (right > left && nums[right] == temp[right]) {
            right--;
        }

        // Already sorted
        if (left == n) {
            return 0;
        }

        return right - left + 1;
    }
}