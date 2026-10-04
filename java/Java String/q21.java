import java.util.*;

public class q21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        System.out.println("The split string is: ");
        for(int i = 0; i < str1.length; i++)
        {
            System.out.println(str1[i]);
        }
        String str2 = String.join(" ", str1);
        System.out.println("Joined string is: " + str2);
    }
}
