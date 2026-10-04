import java.util.*;

class Queue
{

    public static void main(String args[])
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the queue: ");
        int cap = sc.nextInt();
        Queue1 ob = new Queue1(cap);
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter your choice:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the value to be added:");
                    int value = sc.nextInt();
                    ob.enqueue(value);
                    break;
                case 2:
                    int dequeuedValue = ob.dequeue();
                    if(dequeuedValue != -1)
                    {
                        System.out.println("The dequeued value is: " + dequeuedValue);
                    }
                    break;
                case 3:
                    ob.display();
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("Invalid choice, please try again");
            }
            
        }
    }
}

class Queue1
{
    private int[] data;
    private int front;
    private int rear;
    private int size;
    
    public Queue1(int cap)
    {
        data = new int[cap];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            rear++;
            data[rear] = value;
            size++;
        }
    }
    
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else
        {
            int value = data[front];
            front++;
            size--;
            return value;
        }
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public boolean isFull()
    {
        return size == data.length;
    }
    
    public int size()
    {
        return size;
    }
    
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.print("Queue: ");
            for(int i = front; i <= rear; i++)
            {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}