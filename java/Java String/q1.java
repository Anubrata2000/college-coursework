import java.util.*;
public class q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of digits: ");
        String a = sc.nextLine(); int num=0;
        for(int i=0; i<a.length(); i++)
        {
            num=num*10+((int)a.charAt(i)-48);
        }
        System.out.println(num);
        System.out.println(Integer.valueOf(a));
    }
}