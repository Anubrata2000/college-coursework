import java.util.*;

class q23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str = sc.nextLine();
        System.out.println("Enter second string: ");
        String str1 = sc.nextLine();
        if (str.equals(str1)) {
            System.out.println("No uncommon words found.");
        } else {
            String str2[] = str.split(" ");
            String str3[] = str1.split(" ");
            StringBuilder sr = new StringBuilder();
            for (int i = 0; i < Math.min(str2.length,str3.length); i++) {
                if (!Arrays.asList(str3).contains(str2[i])) {
                    sr.append(str2[i]).append(" ");
                }
                if (!Arrays.asList(str2).contains(str3[i])) {
                    sr.append(str3[i]).append(" ");
                }
            }
            System.out.println("Uncommon words from two string are: " + sr.toString());
        }
    }
}
