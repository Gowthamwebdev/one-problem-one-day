import java.util.*;

public class strongPassword {
    public static void main(String[] args) throws Exception {
        Scanner sc=  new Scanner(System.in);
        String str = sc.next();
        if(str.length() < 4 || str.charAt(0) >= '0' && str.charAt(0) <= '9' || str.contains(" ") || str.contains("/")){
            System.out.println("Not possible");
            return;
        }
        boolean caps = false, num = false;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){ 
            caps = true;
            }
            if(ch >= '0' && ch <= '9'){
                num = true;
            }
        }
        if(!caps && !num) System.out.println("Not possible");
        else System.out.println("Possible");
    }
}
