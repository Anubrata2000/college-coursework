import java.util.Scanner;

public class q2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number as a string: ");
        String a = sc.nextLine();
        int num = 0;
        
        // Convert binary string to integer representation
        for(int i = 0; i < a.length(); i++)
        {
            num = num * 2 + ((int) a.charAt(i) -  '0');
        }
        
        // Display the decimal representation
        System.out.println("Decimal representation: " + num);
    }
}
