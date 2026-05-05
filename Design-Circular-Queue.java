1class MyCircularQueue {
2    private int items[];
3    private int front;
4    private int rear;
5    private int size;
6    private int count;
7
8
9    public MyCircularQueue(int k) {
10        this.items = new int[k];
11        this.front = -1;
12        this.rear = 0;
13        this.size = k;
14        this.count = 0;
15    }
16    
17    public boolean enQueue(int value) {
18        if(isFull()) return false;
19        items[rear] = value;
20        rear = (rear + 1) % size;
21        count++;
22        return true;
23    }
24    
25    public boolean deQueue() {
26        if(isEmpty()) return false;
27        front = (front + 1) % size;
28        count--;
29        return true;
30    }
31    
32    public int Front() {
33        if(isEmpty()) return -1;
34        return items[(front + 1) % size];
35    }
36    
37    public int Rear() {
38        if(isEmpty()) return -1;
39        int lastIndex = rear - 1;
40        if(lastIndex == -1) lastIndex = size - 1;
41        return items[lastIndex];
42    }
43    
44    public boolean isEmpty() {
45        return count == 0;
46    }
47    
48    public boolean isFull() {
49        return count == size;
50    }
51}
52
53/**
54 * Your MyCircularQueue object will be instantiated and called as such:
55 * MyCircularQueue obj = new MyCircularQueue(k);
56 * boolean param_1 = obj.enQueue(value);
57 * boolean param_2 = obj.deQueue();
58 * int param_3 = obj.Front();
59 * int param_4 = obj.Rear();
60 * boolean param_5 = obj.isEmpty();
61 * boolean param_6 = obj.isFull();
62 */