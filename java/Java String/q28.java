
import java.util.Scanner;

public class q28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input1 = sc.nextLine();
    System.out.println(consecutiveRepeatitionOfChar(input1));
  }

  public static int consecutiveRepeatitionOfChar(String input1) {
    int c = 0;
    //int n = 0;
    for (int i = 0; i < input1.length() - 1; i++) {
      if (input1.charAt(i) == input1.charAt(i + 1))
        c++;
      else
        c = 0;
    //   if (n == 2)
    //     c++;
    }
    return c;
  }
}