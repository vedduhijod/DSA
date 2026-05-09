import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element
    public void push(int val) {

        stack.push(val);

        // Push into minStack if empty
        // or current value is minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Remove top element
    public void pop() {

        if (stack.isEmpty()) {
            return;
        }

        int removed = stack.pop();

        // Remove from minStack also
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get top element
    public int top() {

        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    // Get minimum element
    public int getMin() {

        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.peek();
    }
}