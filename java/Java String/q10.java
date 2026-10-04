import java.util.*;
public class q10
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a pair of string: ");
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        for(int i=0; i<str.length(); i++)
        {
            for(int j=0; j<str1.length(); j++)
            {
                if(str.charAt(i) == str1.charAt(j))
                {
                    c++;
                }
            }
        }
        System.out.println("No. of matching characters in a pair of strings: "+c);
    }
}