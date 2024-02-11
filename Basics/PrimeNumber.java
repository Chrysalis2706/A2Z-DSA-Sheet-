package DSA_A2Z_Sheet.Basics;
import java.util.Scanner;
public class PrimeNumber {

    // SQUARE ROOT METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i=num1; i<=num2; i++){
            if(isPrime(i) == true) {
                System.out.print(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
//            System.out.println("No");
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
//                System.out.println("No");
                return false;
            } else {
                continue;
            }
        }
//        System.out.println("Yes");
        return true;
    }
}
