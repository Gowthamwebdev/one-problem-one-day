import java.util.PriorityQueue;
import java.util.Scanner;

public class ShopkeeperRevenue {

    public static long getMaximumAmount(int[] quantity, int m) {
        // Use a max-heap (PriorityQueue with reverse order)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        // Add all quantities to the max-heap
        for (int q : quantity) {
            maxHeap.offer(q);
        }
        
        long maxRevenue = 0;
        
        // Sell items to m customers
        for (int i = 0; i < m; i++) {
            // Get the current highest quantity
            int currentQuantity = maxHeap.poll();
            
            // Add to revenue
            maxRevenue += currentQuantity;
            
            // Decrease the quantity and push it back if still positive
            if (currentQuantity - 1 > 0) {
                maxHeap.offer(currentQuantity - 1);
            }
        }
        
        return maxRevenue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of different item types
        System.out.print("Enter the number of different item types (n): ");
        int n = scanner.nextInt();
        
        // Get the quantities of each item type
        int[] quantity = new int[n];
        System.out.println("Enter the quantities of each item type:");
        for (int i = 0; i < n; i++) {
            quantity[i] = scanner.nextInt();
        }
        
        // Get the number of customers
        System.out.print("Enter the number of customers (m): ");
        int m = scanner.nextInt();
        
        // Calculate and display the maximum revenue
        long result = getMaximumAmount(quantity, m);
        System.out.println("The maximum revenue possible is: " + result);
        
        scanner.close();
    }
}
