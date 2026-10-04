import java.util.*;
public class q9
{
    public static void main(String args[])
    {
        int d=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String str1= str.toUpperCase();
        for(int i=0; i<str1.length(); i++)
        {
            char c=str1.charAt(i);
            if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U')
            {
                d++;
            }
        }
        if(d==str1.length() || d>=5)
        {
            System.out.println("Accepted string: "+str);
        }
    }
}