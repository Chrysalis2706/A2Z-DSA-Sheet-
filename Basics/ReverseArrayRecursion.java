package DSA_A2Z_Sheet.Basics;

public class ReverseArrayRecursion {
    public static void reverse(int n, int[] arr){
        int i = 0;
        int j = n-1;
        helper(i, j, arr);
    }
    public static void helper(int i, int j, int[] arr){
        if (i>j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i = i + 1;
        j = j - 1;
        helper(i,j,arr);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        reverse(n, arr);
        System.out.println();
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
