import java.util.Scanner;

public class q5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
        printEvenLengthWords(inputString);
    }
    
    public static void printEvenLengthWords(String inputString)
    {
        String[] words = inputString.split("\\s+");
        System.out.println("Even-length words in the string:");
        
        for(String word : words)
        {
            if(word.length() % 2 == 0)
            {
                System.out.println(word);
            }
        }
    }
}
