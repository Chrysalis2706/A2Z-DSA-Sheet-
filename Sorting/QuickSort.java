package DSA_A2Z_Sheet.Sorting;

public class QuickSort {

    // TC : nLog(n)
    // Sc : constant
    // Worst case : O(n^2) when pivot is taken as the highest element

    public static void quickSort(int[] arr, int si, int ei){
        if (si >= ei) return;

        // to get the partition index
        int partIndex = partition(arr, si, ei);
        quickSort(arr, si, partIndex-1);
        quickSort(arr, partIndex+1, ei);
    }

    // to partition the arrays
    public static int partition(int[] arr, int si, int ei){
        int i = si;
        int j = ei;
        int pivot = arr[si];
        while (i < j){
            // i = do not swap till greater than pivot
            while (arr[i] <= pivot  && i <= ei-1) i++;
            // j = do not swap till lesser than pivot
            while (arr[j] > pivot && j >= si+1) j--;
            // swap when i and j are not crossed
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap with si to place j at right point
        int temp = arr[j];
        arr[j] = arr[si];
        arr[si] = temp;
        return j;
    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        printArr(arr);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
