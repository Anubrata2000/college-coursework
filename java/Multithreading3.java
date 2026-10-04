class Multithreading3
{
    public static void main(String[] args)
    {
        Thread yieldThread = new YieldThread();
        Thread stopThread = new StopThread();
        Thread sleepThread = new SleepThread();
        
        yieldThread.start();
        stopThread.start();
        sleepThread.start();
    }
}

class YieldThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("YieldThread started.");
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("YieldThread executing iteration " + i);
            Thread.yield(); // Yield the CPU to other threads
        }
        
        System.out.println("YieldThread finished.");
    }
}

class StopThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("StopThread started.");
        
        try
        {
            Thread.sleep(2000); // Sleep for 2 seconds
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
        // Stop the thread execution forcefully
        this.stop();
        
        System.out.println("StopThread finished.");
    }
}

class SleepThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("SleepThread started.");
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("SleepThread executing iteration " + i);
            try
            {
                Thread.sleep(1000); // Sleep for 1 second
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        System.out.println("SleepThread finished.");
    }
}
