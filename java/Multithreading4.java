class Multithreading4
{
    public static void main(String[] args)
    {
        Thread thread1 = new PriorityThread("Thread 1");
        Thread thread2 = new PriorityThread("Thread 2");
        Thread thread3 = new PriorityThread("Thread 3");
        
        // Set priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        
        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PriorityThread extends Thread
{
    public PriorityThread(String name)
    {
        super(name);
    }
    
    @Override
    public void run()
    {
        System.out.println("Running " + getName() + " with priority " + getPriority());
    }
}
