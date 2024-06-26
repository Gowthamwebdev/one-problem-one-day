import java.util.*;

class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < len / i; j++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(str)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution s = new Solution();
        System.out.println(s.repeatedSubstringPattern(str));
    }
}
