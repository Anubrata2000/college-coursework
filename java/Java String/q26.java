import java.util.*;

class q26 {
    
    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int arr1[] = {0,1,2,3,4,5,6,7,8,9};
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if (contains(arr1, arr[i]))
            {
                arr[i] = (char)(arr[i] - '0');
                int c = arr[i] + 1;
                System.out.println(c);
            }
        }
        System.out.println(String.valueOf(arr));
    }
}