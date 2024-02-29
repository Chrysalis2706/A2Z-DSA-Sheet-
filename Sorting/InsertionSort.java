package DSA_A2Z_Sheet.Sorting;

public class InsertionSort {

    // TC : O(n^2)
    // Find the correct place of the element and then place it

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++){
            int j = i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {12, 46, 24, 52, 20, 9 };
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
