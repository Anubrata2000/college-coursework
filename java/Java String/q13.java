import java.util.*;
public class q13
{
    public static char findLeastFrequentCharacter(String str)
    {
        if(str == null || str.isEmpty())
        {
            throw new IllegalArgumentException("Input string is null or empty.");
        }
        
        int[] frequency = new int[256]; // Assuming ASCII character set
        
        // Count the frequency of each character in the string
        for(char ch : str.toCharArray())
        {
            frequency[ch]++;
        }
        
        char MaxFrequentChar = 0;
        int maxFrequency = Integer.MIN_VALUE;
        
        // Find the least frequent character and its frequency
        for(char ch : str.toCharArray())
        {
            if(frequency[ch] > maxFrequency)
            {
                maxFrequency = frequency[ch];
                MaxFrequentChar = ch;
            }
        }
        
        return MaxFrequentChar;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char MaxFrequent = findLeastFrequentCharacter(input);
        System.out.println("Input String: " + input);
        System.out.println("Maximum frequent character: " + MaxFrequent);
    }
}
