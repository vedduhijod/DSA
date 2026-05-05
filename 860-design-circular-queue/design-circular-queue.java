class MyCircularQueue {
    private int items[];
    private int front;
    private int rear;
    private int size;
    private int count;


    public MyCircularQueue(int k) {
        this.items = new int[k];
        this.front = -1;
        this.rear = 0;
        this.size = k;
        this.count = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        items[rear] = value;
        rear = (rear + 1) % size;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front = (front + 1) % size;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return items[(front + 1) % size];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        int lastIndex = rear - 1;
        if(lastIndex == -1) lastIndex = size - 1;
        return items[lastIndex];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */