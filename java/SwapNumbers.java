class SwapNumbers
{
    void swap(int x ,int y)
    {
         int temp=x;
         x=y;
         y=temp;
         System.out.println("Numbers after swapping are " + x + " and " + y);
    }
    
    public static void main(String args[])
    {
        SwapNumbers ob = new SwapNumbers();
        ob.swap(6,7);
    }
}