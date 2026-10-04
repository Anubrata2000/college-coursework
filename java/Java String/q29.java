import java.util.*;
public class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");      
        String inputString = sc.nextLine();
        System.out.print("Enter a rotation index: "); 
        int rotationIndex = sc.nextInt(); // The number of characters to rotate

        String rotatedString = rotateString(inputString, rotationIndex);
        System.out.println("Rotated String: " + rotatedString);
    }

    public static String rotateString(String str, int rotationIndex) {
        int len = str.length();
        rotationIndex = rotationIndex % len; // Ensure rotationIndex is within the string length
        String leftPart = str.substring(0, rotationIndex);
        String rightPart = str.substring(rotationIndex);
        return rightPart + leftPart;
    }
}
