import java.util.*;
public class islandPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int  p =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1){
                if(i==0 || arr[i-1][j] == 0)
                    p++;
                if(i==n-1 || arr[i+1][j] == 0)
                    p++;
                if(j==0 || arr[i][j-1] == 0) 
                    p++;
                if(j==n-1 || arr[i][j+1] == 0)
                p++;
            }
        }
        }
        System.out.println(p);
    }
}
