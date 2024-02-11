package DSA_A2Z_Sheet.Basics;
public class PalindromeRecursion {
    public static boolean isPalindrome(String str){
        int n = str.length();
        int i = 0;
        int j = n-1;
        return helper(i,j,str,n);
    }
    private static boolean helper(int i, int j, String str, int n){
        if (i>j) return true;
        char left = str.charAt(i);
        char right = str.charAt(j);
        if (left != right) return false;
        i++;
        j--;
        return helper(i,j,str,n);
    }
    public static void main(String[] args) {
        String str = "amama";
        System.out.println(isPalindrome(str));
    }
}
