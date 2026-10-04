import java.util.Scanner;

class PrimeRange
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a prime number: ");
        int n = input.nextInt();
        System.out.println("All prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) 
        {
            if (isPrime(i)) 
            {
                System.out.print(i + " ");
            }
        }
    }
    
    static boolean isPrime(int n) 
    {
        if (n <= 1) 
        {
            System.out.println("Enter a valid number again");
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) 
            {
                return false;
            }
            else
            {
                return true;
            }
        }
       return true; 
    }
}
