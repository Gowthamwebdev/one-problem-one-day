import java.util.*;

public class pickChocolates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no of choco to pick: " );
        int val = sc.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < val; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }    
}
