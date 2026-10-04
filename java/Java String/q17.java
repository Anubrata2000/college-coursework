import java.util.Scanner;
public class q17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for(int i=0; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch)))
            {
                System.out.println(str+ " contains special character");
                break;
            }
            else if(i == str.length()-1)
                System.out.println(str+ " does NOT contain special character");
        }
    }
}