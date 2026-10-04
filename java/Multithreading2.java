class MyRunnable implements Runnable
{
    private String name;
    
    public MyRunnable(String name)
    {
        this.name = name;
    }
    
    @Override
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Thread " + name + ": " + i);
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

class Multithreading2
{
    public static void main(String[] args)
    {
        // Create three runnable instances
        Runnable runnable1 = new MyRunnable("A");
        Runnable runnable2 = new MyRunnable("B");
        Runnable runnable3 = new MyRunnable("C");
        
        // Create three threads and associate them with the runnables
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        
        // Start the threads concurrently
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
