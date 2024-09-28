import java.util.*;

public class ratFood {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      int rat = sc.nextInt();
      int unit = sc.nextInt();
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }
      rat *= unit;
      System.out.print(helper(rat, arr));
  }  

  public static int helper(int rat, int[] arr){
    int i = 0;
        while(i < arr.length){

            if(rat <= 0){
                return i;
            }

            int temp = arr[i];
            if(temp > rat){
                temp -= rat;
                arr[i] = temp;
            }
            else{
                rat -= temp;
                i++;
            }
        }
         return 0;   
        }
  }

