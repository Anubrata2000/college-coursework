class Multihreading5
{
    public static void main(String[] args)
    {
        SharedResource resource = new SharedResource();
        
        // Create two threads and pass the shared resource to them
        Thread thread1 = new Thread(new MyRunnable(resource));
        Thread thread2 = new Thread(new MyRunnable(resource));
        
        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class SharedResource
{
    private int count = 0;
    
    public synchronized void increment()
    {
        // Synchronize access to the shared resource
        count++;
        System.out.println("Count: " + count);
    }
}

class MyRunnable implements Runnable
{
    private SharedResource resource;
    
    public MyRunnable(SharedResource resource)
    {
        this.resource = resource;
    }
    
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            // Call the synchronized method on the shared resource
            resource.increment();
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
