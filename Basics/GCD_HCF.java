package DSA_A2Z_Sheet.Basics;
public class GCD_HCF {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 9;
        int loop = Math.max(n1, n2);
        int ans = 1;
        for(int i=1; i<=loop; i++){
            int x = 1;
            if (n1%i == 0 && n2%i == 0) x = i;
            ans = Math.max(ans,x);
        }
        System.out.println(ans);

        // using eucliedians algorithm
        // TC : Log (min of n1 or n2)
        while (n1>0 && n2>0){
            if (n1 > n2) n1 = n1 % n2;
            else if (n2 > n1) n2 = n2 % n1;
        }
        int e_ans = (n1 == 0) ? n2 : n1;
        System.out.println(e_ans);
    }
}
