import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int[] nextGreater = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Compute next greater for nums2
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            nextGreater[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(nums2[i]);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < n; j++) {

                if (nums2[j] == nums1[i]) {
                    ans[i] = nextGreater[j];
                    break;
                }
            }
        }

        return ans;
    }
}