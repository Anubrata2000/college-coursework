import java.util.*;
public class q12
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
        
        char leastFrequentChar = 0;
        int minFrequency = Integer.MAX_VALUE;
        
        // Find the least frequent character and its frequency
        for(char ch : str.toCharArray())
        {
            if(frequency[ch] < minFrequency)
            {
                minFrequency = frequency[ch];
                leastFrequentChar = ch;
            }
        }
        
        return leastFrequentChar;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char leastFrequent = findLeastFrequentCharacter(input);
        System.out.println("Input String: " + input);
        System.out.println("Least frequent character: " + leastFrequent);
    }
}
