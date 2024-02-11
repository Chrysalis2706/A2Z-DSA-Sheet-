package DSA_A2Z_Sheet.Basics;

import java.security.spec.RSAOtherPrimeInfo;

public class ShiftArray {
    public static int[] shiftArray(int input1, int[] input2, int input3){
        int n = input1;
        int[] arr = input2;
        int d = input3;
        int[] ans = new int[n];
//        int j = 0;
        if (n==0) return arr;

//        // copying elements from d to n
//        for (int i=d; i<n; i++){
//            ans[j] = arr[i];
//            j++;
//        }
//
//        // from 0 to d
//        for (int i=0; i<d; i++){
//            ans[j] = arr[i];
//            j++;
//        }
////        printArr(ans);
        d=d%n;
        int l=0;
        int  r=n-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        l=0;
        r=n-d-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        l=n-d;
        r=n-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        printArr(arr);
        return arr;
    }

    public static void swap (int l , int r , int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 2;
        int[] newarr = shiftArray(n, arr, d);

    }
}
