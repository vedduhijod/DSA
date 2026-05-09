import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {

        int size = q.size();

        // Add new element
        q.add(x);

        // Rotate previous elements
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }

    // Removes top element
    public int pop() {
        return q.remove();
    }

    // Returns top element
    public int top() {
        return q.peek();
    }

    // Check if empty
    public boolean empty() {
        return q.isEmpty();
    }
}