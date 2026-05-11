class Solution {

    public long subArrayRanges(int[] nums) {

        return sumMax(nums) - sumMin(nums);
    }

    // Contribution as maximum
    private long sumMax(int[] nums) {

        int n = nums.length;
        long sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            while (!stack.isEmpty() &&
                  (i == n || nums[stack.peek()] < nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long count =
                        (long)(mid - left) * (right - mid);

                sum += (long) nums[mid] * count;
            }

            stack.push(i);
        }

        return sum;
    }

    // Contribution as minimum
    private long sumMin(int[] nums) {

        int n = nums.length;
        long sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            while (!stack.isEmpty() &&
                  (i == n || nums[stack.peek()] > nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long count =
                        (long)(mid - left) * (right - mid);

                sum += (long) nums[mid] * count;
            }

            stack.push(i);
        }

        return sum;
    }
}