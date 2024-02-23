import java.util.Random;

/**
 * Quick Sort
 *
 * This is an implementation of the Quick Sort algorithm in Java. Quick Sort is a
 * divide-and-conquer algorithm that uses a pivot element to partition the array
 * into two sub-arrays, and then recursively sorts each sub-array. This results
 * in a very efficient sorting algorithm, with an average and best-case time
 complexity of O(n log n), and a worst-case time complexity of O(n^2).
 *
 * @author Isaiah Ayres
 * @author Dan Obrien
 * @author Joseph Kabesha
 */
public class QuickSort {

    /**
     * The main quicksort function. This function takes an array of integers, and
     * the starting and ending indices of the portion of the array to be sorted,
     * and recursively sorts it using the partition function.
     *
     * @param arr   the array of integers to be sorted
     * @param begin the starting index of the portion of the array to be sorted
     * @param end   the ending index of the portion of the array to be sorted
     */
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(arr, begin, end);
            quickSort(arr, begin, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    /**
     * The partition function. This function takes an array of integers, and the
     * starting and ending indices of the portion of the array to be partitioned,
     * and partitions it using the pivot element. The pivot element is chosen as
     * the last element in the portion of the array to be partitioned. The
     * function then iterates over the portion of the array, swapping elements
     * that are less than or equal to the pivot with elements that are greater
     * than the pivot, until it reaches the pivot element. At this point, the
     * pivot element is in its final sorted position, and the function returns
     * the index of the pivot element.
     *
     * @param arr   the array of integers to be partitioned
     * @param begin the starting index of the portion of the array to be
     *              partitioned
     * @param end   the ending index of the portion of the array to be
     *              partitioned
     * @return the index of the pivot element
     */
    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int low = begin - 1;

        for (int i = begin; i < end; i++) {
            if (arr[i] <= pivot) {
                low += 1;
                int temp = arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[low + 1];
        arr[low + 1] = arr[end];
        arr[end] = temp;

        return low + 1;
    }

    /**
     * The main function. This function creates a random array of integers, prints
     * the original array, sorts it using the quickSort function, and then prints
     * the sorted array.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();

        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.println("Original Array:");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
        quickSort(a, 0, 100 - 1);
        System.out.println("Sorted Array:");
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}