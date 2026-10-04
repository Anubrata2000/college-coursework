import java.util.*;
public class q7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        String b[]=a.split("\\s");
        for(int i=0; i<b.length; i++)
        {
            String str = b[i];
            char c = str.charAt(0);
            char d = str.charAt(str.length()-1);
            if((c>='A' && c<='Z')&&(d>='A' && d<='Z'))
            {
                System.out.print(str);
            }
            else
            {
                c = (char)(c + 'A'-'a');
                d = (char)(d + 'A'-'a');
                String str1 = c+str.substring(1,str.length()-1)+d;
                System.out.println(str1);
            }
        }
    }
}