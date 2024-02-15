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
        // TODO- Finish coding to array generation & print routine
    }
    public static void main(String[] args) {
        int arr[] = {13, 64, 23, 49, 32, 55, 70, 5, 94, 85}; // Create an array of 10 values
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