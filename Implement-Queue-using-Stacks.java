1import java.util.Stack;
2
3class MyQueue {
4
5    private Stack<Integer> s1;
6    private Stack<Integer> s2;
7
8    public MyQueue() {
9        this.s1 = new Stack<>();
10        this.s2 = new Stack<>();
11    }
12
13    // Push element into queue
14    public void push(int x) {
15        s1.push(x);
16    }
17
18    // Remove element from queue
19    public int pop() {
20
21        if (s1.isEmpty() && s2.isEmpty()) {
22            System.out.println("Queue is Empty");
23            return -1;
24        }
25
26        // Transfer elements if s2 is empty
27        if (s2.isEmpty()) {
28
29            while (!s1.isEmpty()) {
30                s2.push(s1.pop());
31            }
32        }
33
34        return s2.pop();
35    }
36
37    // Get front element
38    public int peek() {
39
40        if (s1.isEmpty() && s2.isEmpty()) {
41            return -1;
42        }
43
44        // Transfer elements if s2 is empty
45        if (s2.isEmpty()) {
46
47            while (!s1.isEmpty()) {
48                s2.push(s1.pop());
49            }
50        }
51
52        return s2.peek();
53    }
54
55    // Check if queue is empty
56    public boolean empty() {
57        return s1.isEmpty() && s2.isEmpty();
58    }
59}
60
61/**
62 * Your MyQueue object will be instantiated and called as such:
63 * MyQueue obj = new MyQueue();
64 * obj.push(x);
65 * int param_2 = obj.pop();
66 * int param_3 = obj.peek();
67 * boolean param_4 = obj.empty();
68 */