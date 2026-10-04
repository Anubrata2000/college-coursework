import java.util.*;

class q25 {
    static void permutation(String str, String result)
    {
        if(str.length() == 0)
        {
            System.out.print(result+" ");
            return;
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
            
            permutation(ros, result + ch);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str = sc.nextLine();
        permutation(str,"");
    }
}