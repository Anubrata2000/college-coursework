import java.util.Scanner;

class SumOfSeries 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        double sum = 0;
        Series ob = new Series();
        for (int i = 1; i <= n; i++) 
        {
            sum += 1.0 / ob.factorial(i);
        }
        System.out.println("Sum of " + n + " terms in the series: " + sum);
    }
}
    
class Series
{    
    int factorial(int n) 
    {
        if (n == 0 || n==1) 
        {
            return 1;
        } 
        else 
        {
            return n * factorial(n - 1);
        }
    }
}
