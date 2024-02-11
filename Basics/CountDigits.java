package DSA_A2Z_Sheet.Basics;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        int n = 336;
        // Write your code here.
        int ans = 0;
        int dig = n;
        while(n>0){
            int x = n%10;
            if (x != 0 && dig%x == 0) ans++;
            n = n/10;
        }
        System.out.println(ans);
    }
}
