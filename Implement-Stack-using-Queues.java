1class MyStack {
2    static class Node{
3        int data;
4        Node next;
5        Node(int data){
6            this.data = data;
7            this.next = null;
8        }
9    }
10    private Node top;
11
12    public MyStack() {
13        this.top = null;
14    }
15    
16    public void push(int x) {
17        Node newNode = new Node(x);
18        newNode.next = top;
19        top = newNode;
20    }
21    
22    public int pop() {
23        int popped = top.data;
24        top = top.next;
25
26        return popped;
27    }
28    
29    public int top() {
30      return top.data;  
31    }
32    
33    public boolean empty() {
34        return top == null;
35    }
36}
37
38/**
39 * Your MyStack object will be instantiated and called as such:
40 * MyStack obj = new MyStack();
41 * obj.push(x);
42 * int param_2 = obj.pop();
43 * int param_3 = obj.top();
44 * boolean param_4 = obj.empty();
45 */