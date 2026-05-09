1import java.util.Stack;
2
3class MinStack {
4
5    private Stack<Integer> stack;
6    private Stack<Integer> minStack;
7
8    // Constructor
9    public MinStack() {
10        stack = new Stack<>();
11        minStack = new Stack<>();
12    }
13
14    // Push element
15    public void push(int val) {
16
17        stack.push(val);
18
19        // Push into minStack if empty
20        // or current value is minimum
21        if (minStack.isEmpty() || val <= minStack.peek()) {
22            minStack.push(val);
23        }
24    }
25
26    // Remove top element
27    public void pop() {
28
29        if (stack.isEmpty()) {
30            return;
31        }
32
33        int removed = stack.pop();
34
35        // Remove from minStack also
36        if (removed == minStack.peek()) {
37            minStack.pop();
38        }
39    }
40
41    // Get top element
42    public int top() {
43
44        if (stack.isEmpty()) {
45            return -1;
46        }
47
48        return stack.peek();
49    }
50
51    // Get minimum element
52    public int getMin() {
53
54        if (minStack.isEmpty()) {
55            return -1;
56        }
57
58        return minStack.peek();
59    }
60}