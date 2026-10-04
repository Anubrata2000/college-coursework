import java.util.concurrent.ArrayBlockingQueue;

class BoundedBuffer
{
    public static void main(String args[])
    {
        BoundedBuffer1 ob = new BoundedBuffer1(4);
        try
        {
            //ob.consume();
            ob.produce(10);
            ob.produce(20);
            ob.consume();
            ob.display();
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
            // Handle the exception
        }
    }
}

class BoundedBuffer1
{
    final ArrayBlockingQueue<Integer> buffer;
    
    BoundedBuffer1(int capacity)
    {
        buffer = new ArrayBlockingQueue<>(capacity);
    }
    
    public void produce(int data) throws InterruptedException
    {
        buffer.put(data);
    }
    
    public int consume() throws InterruptedException
    {
        return buffer.take();
    }
    
    public void display()
    {
        if(buffer.isEmpty())
        {
            System.out.println("Buffer is empty");
        }
        else
        {
            System.out.print("Buffer: ");
            for(Integer data : buffer)
            {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
