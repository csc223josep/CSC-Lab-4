    /**
     * Bubble Sort
     * 
     * @author Isaiah Ayres
     * @author Dan Obrien 
     * @author Joseph Kabesha  
     */
public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            
            if (swapped == false) {
                break;
            }
        }
    }
    static void arrayPrint(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {67, 78, 32, 87, 20, 83, 42, 1, 29, 66}; // Create an array of 10 values
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}