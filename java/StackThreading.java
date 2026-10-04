class StackThreading
{
    public static void main(String args[])
    {
        ThreadSafeStack ob = new ThreadSafeStack(4);
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.display();
        ob.pop();
        ob.display();
    }
}
class ThreadSafeStack {
    int[] data;
    int top;

    public ThreadSafeStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public synchronized void push(int value) {
        while (isFull()) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        top++;
        data[top] = value;
        notifyAll();
    }

    public synchronized int pop() {
        while (isEmpty()) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }

        int value = data[top];
        top--;
        notifyAll();
        return value;
    }

    public synchronized int peek() {
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }

        return data[top];
    }

    public synchronized boolean isEmpty() {
        return top == -1;
    }

    public synchronized boolean isFull() {
        return top == data.length - 1;
    }

    public synchronized int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}
