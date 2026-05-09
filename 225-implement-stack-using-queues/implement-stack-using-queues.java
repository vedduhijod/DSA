class MyStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top;

    public MyStack() {
        this.top = null;
    }
    
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }
    
    public int pop() {
        int popped = top.data;
        top = top.next;

        return popped;
    }
    
    public int top() {
      return top.data;  
    }
    
    public boolean empty() {
        return top == null;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */