import java.util.*;

class q27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        String arr[] = str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(word))
            {
                System.out.println("Word location: "+i);
            }
        }
    }
}