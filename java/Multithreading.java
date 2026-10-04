class MyThread extends Thread
{
    private String name;
    
    public MyThread(String name)
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
class Multithreading
{
    public static void main(String[] args)
    {
        // Create three threads
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");
        MyThread thread3 = new MyThread("C");
        
        // Start the threads concurrently
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
