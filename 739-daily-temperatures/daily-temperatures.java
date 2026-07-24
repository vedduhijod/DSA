import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>(); // stores indices

        // Last day has no warmer day ahead
        ans[n - 1] = 0;
        stack.push(n - 1);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {

            // Remove all indices whose temperatures are
            // less than or equal to the current temperature
            while (!stack.isEmpty() &&
                   temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            // If stack is empty, no warmer day exists
            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                // Distance to the next warmer day
                ans[i] = stack.peek() - i;
            }

            // Push current index
            stack.push(i);
        }

        return ans;
    }
}