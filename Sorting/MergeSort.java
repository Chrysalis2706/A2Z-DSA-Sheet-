package DSA_A2Z_Sheet.Sorting;

public class MergeSort {

    public static void mergeSort(int[] arr, int si, int ei){
        if (si >= ei) return;

        // take mid of the array
        int mid = si + (ei-si)/2;

        // divide parts
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        // conquer
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] newArr = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k  = 0;
        while(i<=mid && j<=ei){
            if (arr[i] <= arr[j]){
                newArr[k] = arr[i];
                i++;
            }else {
                newArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            newArr[k++] = arr[i++];
        }
        while(j<=ei){
            newArr[k++] = arr[j++];
        }

        // add to existing array
        for (i=si, k=0; k<newArr.length; k++,i++){
            arr[i] = newArr[k];
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
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
