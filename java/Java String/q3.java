import java.util.*;
public class q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1;
        String s = sc.nextLine();
        System.out.print("Enter the index i to be removed from the string: ");
        int i=sc.nextInt();
        if(i==0)
        {
            s1=s.substring(i+1);
            System.out.println(s1);
        }
        else if(i==(s.length()-1))
        {
            s1=s.substring(0,s.length()-1);
            System.out.println(s1);
        }
        else
        {
            s1=s.substring(0,i)+s.substring(i+1);
            System.out.println(s1);
        }
    }
}