import java.util.*;
public class q19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a length: ");
        int k = sc.nextInt();
        String arr[] = str.split(" ");
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].length() > k)
            {
                System.out.println(arr[i]);
            }
        }
    }
}