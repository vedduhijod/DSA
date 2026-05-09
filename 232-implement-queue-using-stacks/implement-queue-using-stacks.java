import java.util.Stack;

class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    // Push element into queue
    public void push(int x) {
        s1.push(x);
    }

    // Remove element from queue
    public int pop() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        // Transfer elements if s2 is empty
        if (s2.isEmpty()) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    // Get front element
    public int peek() {

        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        // Transfer elements if s2 is empty
        if (s2.isEmpty()) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */