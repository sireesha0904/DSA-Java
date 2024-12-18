package arrayaPr;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {

        //STEP-1: Base condition (stop splitting if the array has 1 or 0 elements)
        if (array.length < 2) {
            return; // base condition for recursion
        }

        // Step 2: Split the array into two halves
        int mid = array.length / 2; // Find the middle index
        int[] left = Arrays.copyOfRange(array, 0, mid); // Copy the left half 
        int[] right = Arrays.copyOfRange(array, mid, array.length); // Copy the right half

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) 
            {
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
       int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        mergeSort(array); // Call mergeSort to sort the array
        
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
