import java.util.Scanner;
class Fibonacci
 {
    public static void main(String[] args) 
    {
        Findfibo ob1 = new Findfibo();
        ob1.sum();
    }    
 }


class Findfibo
{
    public void sum()
    {
        int n,next,a = 0, b = 1,sum = 0;
        System.out.println("Enter the range: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i = 1; i <= n; i++) 
        {
            System.out.print(a + " ");
            sum += a;
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\nSum of the Fibonacci series: " + sum);
     }
}