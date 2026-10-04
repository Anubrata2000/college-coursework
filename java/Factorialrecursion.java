import java.util.Scanner;

public class Factorialrecursion
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println(n + "! = " + factorial);
    }
    
    static int calculateFactorial(int n) 
    {
        if (n == 0) 
        {
            return 1;
        } 
        else if (n==1) 
        {
            return 1;
        }
        else
        {
            return n * calculateFactorial(n - 1);
        }
    }
}
