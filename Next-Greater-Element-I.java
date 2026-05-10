1import java.util.*;
2
3class Solution {
4
5    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
6
7        Stack<Integer> stack = new Stack<>();
8        Map<Integer, Integer> map = new HashMap<>();
9
10        // Traverse nums2 from right to left
11        for (int i = nums2.length - 1; i >= 0; i--) {
12
13            int element = nums2[i];
14
15            // Remove smaller elements
16            while (!stack.isEmpty() && stack.peek() <= element) {
17                stack.pop();
18            }
19
20            // Store next greater element
21            if (stack.isEmpty()) {
22                map.put(element, -1);
23            } else {
24                map.put(element, stack.peek());
25            }
26
27            // Push current element
28            stack.push(element);
29        }
30
31        int[] result = new int[nums1.length];
32
33        // Build answer for nums1
34        for (int i = 0; i < nums1.length; i++) {
35            result[i] = map.get(nums1[i]);
36        }
37
38        return result;
39    }
40}