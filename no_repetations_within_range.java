import java.util.*;

public class noRepeatInRange {

    public static boolean isRepeat(int num) {
        Set<Integer> digits = new HashSet<>();
        while (num > 0) {
            int digit = num % 10;
            if (digits.contains(digit)) {
                return true;
            }
            digits.add(digit);
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            if (!isRepeat(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
