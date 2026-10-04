import java.util.*;

class q24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==',')
            {
                arr[i]='.';
            }
        }
        System.out.println(String.valueOf(arr));
    }
}