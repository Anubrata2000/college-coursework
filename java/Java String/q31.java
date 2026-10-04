import java.util.Scanner;
public class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");  
        String originalString = sc.nextLine();
        int minRotations = findMinimumRotations(originalString);
        System.out.println("Minimum number of rotations: " + minRotations);
    }

    public static int findMinimumRotations(String str) {
        String originalString = str + str; // Double the original string to make it circular

        for (int rotations = 1; rotations <= str.length(); rotations++) {
            String rotatedString = originalString.substring(rotations, rotations + str.length());
            if (rotatedString.equals(str)) {
                return rotations;
            }
        }

        return -1; // If no rotations needed to obtain the original string
    }
}
