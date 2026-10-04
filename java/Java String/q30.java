import java.util.Scanner;
public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");        
        String inputString = sc.nextLine();
        boolean canBecomeEmpty = canBecomeEmptyByDeletion(inputString);
        System.out.println("Can the string become empty by recursive deletion? " + canBecomeEmpty);
    }

    public static boolean canBecomeEmptyByDeletion(String str) {
        if (str.isEmpty()) {
            return true; // Base case: string is empty, return true
        }

        for (int i = 0; i < str.length(); i++) {
            String substring = str.substring(0, i) + str.substring(i + 1); // Delete the character at index i
            if (canBecomeEmptyByDeletion(substring)) {
                return true;
            }
        }

        return false;
    }
}
