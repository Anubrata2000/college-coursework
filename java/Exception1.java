class Exception1
{
    public static void main(String[] args)
    {
        try
        {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        try
        {
            String str = null;
            int length = getStringLength(str);
            System.out.println("Length: " + length);
        }
        catch(NullPointerException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    public static int divide(int num1, int num2)
    {
        return num1 / num2;
    }
    
    public static int getStringLength(String str)
    {
        return str.length();
    }
}
