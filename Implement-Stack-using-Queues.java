1import java.util.LinkedList;
2import java.util.Queue;
3
4class MyStack {
5
6    Queue<Integer> q = new LinkedList<>();
7
8    // Push element onto stack
9    public void push(int x) {
10
11        int size = q.size();
12
13        // Add new element
14        q.add(x);
15
16        // Rotate previous elements
17        for (int i = 0; i < size; i++) {
18            q.add(q.remove());
19        }
20    }
21
22    // Removes top element
23    public int pop() {
24        return q.remove();
25    }
26
27    // Returns top element
28    public int top() {
29        return q.peek();
30    }
31
32    // Check if empty
33    public boolean empty() {
34        return q.isEmpty();
35    }
36}