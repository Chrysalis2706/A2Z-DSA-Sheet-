package DSA_A2Z_Sheet.Sorting;

public class SelectionSort {
    // TC : O(n^2)
    // Get the minimum and swap it with the beginning
    public static void selectionSort(int[] arr){
        int minPos = 0;
        for (int i=0; i<arr.length-1; i++){
            minPos = i;
            for (int j=i+1; j< arr.length; j++){
                // found min pos
                if (arr[minPos] >= arr[j]) minPos = j;
            }
            // swap with min pos
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        int[] arr = {13, 46, 24, 52, 20, 9};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }


}
