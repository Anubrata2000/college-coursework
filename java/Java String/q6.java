import java.util.Scanner;

public class q6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
        String uppercasedString = uppercaseHalf(inputString);
        System.out.println("Uppercase half of the string: " + uppercasedString);
    }
    
    public static String uppercaseHalf(String inputString)
    {
        int length = inputString.length();
        int halfLength = length / 2;
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < length; i++)
        {
            char ch = inputString.charAt(i);
            if(i >= halfLength)
            {
                // Check if the character is a lowercase letter
                if(ch >= 'a' && ch <= 'z')
                {
                    // Convert to uppercase by adding the difference between 'A' and 'a'
                    ch = (char)(ch + ('A' - 'a'));
                }
            }
            result.append(ch);
        }
        
        return result.toString();
    }
}
