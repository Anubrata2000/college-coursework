import java.util.*;
public class q8
{
    public static void main(String args[])
    {
        int c=0,d=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str =sc.nextLine().toLowerCase();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                c=1;
            }
            if(ch>='0' && ch<='9')
            {
                d=1;
            }
        }
        if(c==1)
        {
            System.out.println("Atleast one letter is present.");
        }
        if(d==1)
        {
            System.out.println("Atleast one number is present.");
        }
    }
}