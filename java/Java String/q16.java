import java.util.*;
public class q16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); int c=0;
        char str1[] = str.toCharArray();
        for(int i=0; i<str1.length; i++)
        {
            if(str1[i]>='0' && str1[i]<='9')
            {
                c++;
            }
        }
        System.out.print("Frequency of numbers in a string: "+c);
    }
}