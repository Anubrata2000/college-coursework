import java.util.*;

class ThreadedStack {
     int[] stack;
     int capacity;

    public ThreadedStack(int capacity) 
    {
        stack = new ();
        this.capacity = capacity;
    }

    public synchronized void push(int value) //throws InterruptedException 
    {
        while (stack.size() == capacity) {
            wait();
        }
        stack.push(value);
        notifyAll();
    }

    public synchronized int pop() //throws InterruptedException 
    {
        while (stack.isEmpty()) {
            wait(); 
        }
        int value = stack.pop();
        notifyAll();
        return value;
    }
    public boolean isEmpty() 
    {
        return top == -1;
    }
    
    public boolean isFull() 
    {
        return top == data.length - 1;
    }
}
