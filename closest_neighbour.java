import java.util.*;

public class closestNeighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int res = 0;
        res += Math.abs(list.get(0) - list.get(1)) + Math.abs(list.get(list.size() - 1) - list.get(list.size()-2));
        // int res = 0;
        for (int i = 1; i < list.size()-1; i++) {
            res += Math.min((Math.abs(list.get(i) - list.get(i-1))), Math.abs(list.get(i) - list.get(i+1)));
        }
        System.err.println(res);
    }
}
