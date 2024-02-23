public class MergeSort{
    // Merges two subarrays of arr[]
    public static void merge(int arr[], int left, int mid, int right){

        // Calculate the size of the merged array
        int mergedSize = right-left+1;

        // Initialize the merge position and the left and right positions
        int mergePos = 0;
        int leftPos = left;
        int rightPos = mid + 1;

        // Initialize the mergedNumber array with the calculated size
        int[] mergedNumber = new int[mergedSize];

        // Merge the two subarrays by comparing their elements
        while (leftPos <= mid && rightPos <= right){
            if (arr[leftPos] <= arr[rightPos]){
                mergedNumber[mergePos] = arr[leftPos++];
            } else {
                mergedNumber[mergePos] = arr[rightPos++];
            }
            mergePos++;
        }

        // Copy the remaining elements from the left subarray
        while (leftPos <= mid){
            mergedNumber[mergePos++] = arr[leftPos++];
        }

        // Copy the remaining elements from the right subarray
        while (rightPos <= right){
            mergedNumber[mergePos++] = arr[rightPos++];
        }

        // Copy the merged elements back to the original array
        for (mergePos = 0; mergePos < mergedSize; mergePos++){
            arr[left + mergePos] = mergedNumber[mergePos];
        }
    }

    // Recursively sort the array
    public static void sort(int arr[], int left, int right){
        int mid = 0;
        if (left < right){
            mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Main method to test the sorting algorithm
    public static void main(String[] args){
        int arr[] = {13, 64, 23, 49, 32, 55, 70, 5, 94, 85, -1}; // Create an array of 11 values
        System.out.println("Given Array");
        for (int i = 0; i < arr.length; ++i) // Print the given array
            System.out.print(arr[i] + " ");
        System.out.println();

        sort(arr, 0, arr.length-1); // Sort the array

        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; ++i) // Print the sorted array
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}