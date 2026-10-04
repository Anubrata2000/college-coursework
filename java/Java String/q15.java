import java.util.*;
public class q15
{
    public static void frequency(String str, char n)
    {
        char str1[] = str.toCharArray(); int c=0;
        for(int i=0; i<str1.length; i++)
        {
            if(str1[i] == n)
            {
                c++;
            }
        }
        System.out.println("Frequency of specific character "+n+" is "+c);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character:");
        char n = sc.next().charAt(0);
        frequency(str,n);
    }
}