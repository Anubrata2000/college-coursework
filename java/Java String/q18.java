import java.util.Random;
import java.util.Scanner;
public class q18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        while(true)
        {
            for(int i=0; i< str.length(); i++)
            {
                char ch = (char)(random.nextInt(94)+32);
                sb.append(ch);
            }
            System.out.println("Randomly generated string is "+sb);
            if(str.equals(sb.toString()))
            {
                System.out.println("Match found! Generated string matches the given string.");
                break;
            }
            sb.setLength(0);
        }
    }
}

//import java.util.Random;
//import java.util.Scanner;
//
//public class q18
//{
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//        StringBuilder sb = new StringBuilder();
//
//        Random random = new Random();
//
//        while(true)
//        {
//            // Generating a random string of the same length as the given string
//            for(int i = 0; i < str.length(); i++)
//            {
//                char ch = (char)(random.nextInt(94) + 32);
//                sb.append(ch);
//            }
//
//            System.out.println("Randomly generated string is " + sb);
//
//            // Comparing the generated string with the given string using equals method
//            if(str.equals(sb.toString()))
//            {
//                System.out.println("Match found! Generated string matches the given string.");
//                break;
//            }
//
//            sb.setLength(0); // Clear the StringBuilder for the next iteration
//        }
//    }
//}
