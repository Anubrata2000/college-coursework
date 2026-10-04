import java.util.*;
public class q14
{
    public static void oddfrequencycharacters(String str)
    {
        int freq[] = new int[26];
        for(int i=0; i<str.length(); i++)
        {
            freq[str.charAt(i) - 'a']++;
        }
        for(int i=0; i<str.length(); i++)
        {
            if(freq[str.charAt(i) - 'a'] % 2 != 0)
            {
                System.out.print(str.charAt(i));
            }
            
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        oddfrequencycharacters(input);
    }
}