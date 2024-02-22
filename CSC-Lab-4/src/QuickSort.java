import java.util.Random;

/**
 * Quick Sort
 * 
 * @author Isaiah Ayres
 * @author Dan Obrien
 * @author Joseph Kabesha
 */

public class QuickSort {
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int  pivotIndex = partition(arr, begin, end);
            quickSort(arr, begin,pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }
    public static int partition(int[] arr, int begin, int end) {
        int midpoint = begin + (end - begin)/2;
        int pivot = arr[end];        
        while (begin < end) {
            while (arr[begin] < pivot) {
                begin++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (begin < end) {
                int temp = arr[begin];
                arr[begin] = arr[end];
                arr[end] = temp;
                begin+=1;
                end-=1;
            }
        }
        return end;
    }

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
