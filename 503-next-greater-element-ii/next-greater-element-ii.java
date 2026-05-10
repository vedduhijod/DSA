class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = -1;

            for (int j = 1; j < n; j++) {
                int id = (i + j) % n;

                if (nums[id] > nums[i]) {
                    arr[i] = nums[id];
                    break;
                }
            }
        }
        return arr;
    }
}