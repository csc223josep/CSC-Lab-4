/**
 * Bubble Sort
 * 
 * @author Isaiah Ayres
 * @author Dan Obrien 
 * @author Joseph Kabesha  
 */
public class BubbleSort {
    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * 
     * @param arr the array to be sorted
     * @param n the number of elements in the array
     */
    public static void bubbleSort(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) { // Outer loop for number of passes
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparing adjacent elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Swap the elements if they are in the wrong order
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            
            if (swapped == false) { // If no two elements were swapped in the inner loop, the array is already sorted
                break;
            }
        }
    }
    
    /**
     * Prints the elements of an array.
     * 
     * @param arr the array to be printed
     * @param size the number of elements in the array
     */
    static void arrayPrint(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {67, 78, 32, 87, 20, 83, 42, 1, 29, 66,-1}; // Create an array of 10 values
        int n = arr.length;
        bubbleSort(arr,n);
        System.out.println("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}