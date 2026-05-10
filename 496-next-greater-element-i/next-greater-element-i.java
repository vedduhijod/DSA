import java.util.*;

class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            int element = nums2[i];

            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }

            // Store next greater element
            if (stack.isEmpty()) {
                map.put(element, -1);
            } else {
                map.put(element, stack.peek());
            }

            // Push current element
            stack.push(element);
        }

        int[] result = new int[nums1.length];

        // Build answer for nums1
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}