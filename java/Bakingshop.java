import java.util.Scanner;

public class Bakingshop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while(T-- > 0)
        {
            int N = scanner.nextInt(); // Number of customers
            int A = scanner.nextInt(); // Number of eggs
            int B = scanner.nextInt(); // Number of bags of flour
            int C1 = scanner.nextInt(); // Cost of omelette
            int C2 = scanner.nextInt(); // Cost of bread
            int C3 = scanner.nextInt(); // Cost of cake
            
            int minCost = -1; // Initialize minCost as -1
            
            // Check if there are enough ingredients to make the items
            if(N * C1 <= A && N * C2 <= B)
            {
                // Calculate the cost for N omelettes and N breads
                minCost = N * C1 + N * C2;
            }
            else if(N * C3 <= A + B)
            {
                // Calculate the cost for N cakes
                minCost = N * C3;
            }
            
            System.out.println(minCost);
        }
        
        scanner.close();
    }
}