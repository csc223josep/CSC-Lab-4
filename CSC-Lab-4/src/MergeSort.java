/**
 * Merge Sort
 * 
 * @author Isaiah Ayres
 * @author Dan Obrien
 * @author Joseph Kabesha
 */

public class MergeSort {
    // Merges two subarrays of arr[]
    public static void merge(int arr[], int left, int mid, int right) {

        int mergedSize = right-left+1;
        int mergePos = 0;
        int leftPos=0;
        int rightPos=0;
        int [] mergedNumber = new int [mergedSize];

        leftPos=left;
        rightPos= mid+1;
        while (leftPos <= mid && rightPos <=right){
            if (arr[leftPos] <= arr[rightPos]){
                mergedNumber[mergePos]=arr[leftPos++];
            }else{
                mergedNumber[mergePos]=arr[rightPos++];
            }
            mergePos++;
        }
        while  (leftPos<=mid){
            mergedNumber[mergePos++]=arr[leftPos++];
        }
        while  (rightPos <= right){
            mergedNumber[mergePos++]=arr[rightPos++];
        }

        for (mergePos = 0; mergePos < mergedSize ; mergePos++){
            arr[left+mergePos] = mergedNumber[mergePos];
        }
    

    }
    public static void sort(int arr[],int  left, int right){
        int mid= 0;
        if  (left<right){
            mid=(left + right)/2;
            sort(arr, left, mid);
            sort(arr ,  mid+1, right);
            merge(arr, left, mid, right);
        }

    }

    public static void main(String[] args) {
        int arr[] = {13, 64, 23, 49, 32, 55, 70, 5, 94, 85,-1}; // Create an array of 10 values
        System.out.println("Given Array");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

        MergeSort.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}