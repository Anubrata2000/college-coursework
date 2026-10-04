import java.util.*;
public class q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); int c=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                c++;
            }
        }
        System.out.println(c);
    }
}