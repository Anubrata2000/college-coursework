import java.util.Scanner;
class Biggest
{
    public static void main(String args[])
    {
		BiggestOfThree ob1 = new BiggestOfThree();
          ob1.big();
    }
}

class BiggestOfThree
{
   public void big()
   {       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int biggest = num1;
        
        if(num2 > biggest && num2 > num3) 
        {
            biggest = num2;
        } 
        else if(num3 > biggest && num3 > num2) 
        {
            biggest = num3;
        }
        
        System.out.println("The biggest number is: " + biggest);
    }
}
      
