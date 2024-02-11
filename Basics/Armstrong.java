package DSA_A2Z_Sheet.Basics;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int k = inp.length();
        int n = Integer.parseInt(inp);
        int sum = 0;
        int dig = n;
        while (dig > 0){
            int rem = dig % 10;
            sum += Math.pow(rem, k);
            dig = dig / 10;
        }
        if (sum == n) System.out.println("YES");
        else System.out.println("NO");
    }
}
