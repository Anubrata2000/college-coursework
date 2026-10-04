import java.util.*;

class Stack
{
    public static void main(String args[])
    {
        Stack1 ob = new Stack1();
        boolean flag = true;
        while(flag)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Push element into stack");
            System.out.println("2. Pop element from stack");
            System.out.println("3. Peek element from stack");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Get size of stack");
            System.out.println("7. Display stack elements");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the value to be pushed: ");
                    int value = sc.nextInt();
                    ob.push(value);
                    break;
                case 2:
                    int popVal = ob.pop();
                    if(popVal != -1)
                    {
                        System.out.println("Popped element: " + popVal);
                    }
                    break;
                case 3:
                    int peekVal = ob.peek();
                    if(peekVal != -1)
                    {
                        System.out.println("Peeked element: " + peekVal);
                    }
                    break;
                case 4:
                    if(ob.isEmpty())
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    if(ob.isFull())
                    {
                        System.out.println("Stack is full");
                    }
                    else
                    {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    System.out.println("Size of stack: " + ob.size());
                    break;
                case 7:
                    ob.display();
                    break;
                case 8:
                    flag = false;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
            }
            
        }
    }
}

class Stack1
{
    private int[] data;
    private int top;
    private int size;
    
    public Stack1()
    {
        System.out.print("Enter the capacity of the stack: ");
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        data = new int[cap];
        top = -1;
        size = 0;
    }
    
    public void push(int value)
    {
        try
        {
            if(isFull())
            {
                throw new Exception("Stack is full");
            }
            else
            {
                top++;
                data[top] = value;
                size++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public int pop()
    {
        try
        {
            if(isEmpty())
            {
                throw new Exception("Stack is empty");
            }
            else
            {
                int value = data[top];
                top--;
                size--;
                return value;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    public int peek()
    {
        try
        {
            if(isEmpty())
            {
                throw new Exception("Stack is empty");
            }
            else
            {
                return data[top];
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public boolean isFull()
    {
        return top == data.length - 1;
    }
    
    public int size()
    {
        return size;
    }
    
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.print("Stack: ");
            for(int i = top; i >= 0; i--)
            {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}
